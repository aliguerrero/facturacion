
package controlador;

import com.sun.crypto.provider.RSACipher;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class Sentencias_sql {
    
    private conexion con;
    PreparedStatement ps;
    ResultSet res;

    public Sentencias_sql() {
        con = new conexion();
    }
    
    public boolean insertar(String datos[], String insert){
      boolean estado = false;
       try {
            ps = con.conectado().prepareStatement(insert);
            for(int i=0; i<=datos.length-1;i++){
                ps.setString(i+1, datos[i]);
            }
            ps.execute();
            ps.close();
            estado = true;
         }catch(SQLException e){
         System.out.println(e);
         estado = false;
        }
       return estado;
    }
    public String buscar(String select){
       String registros = null;
      
      try{
         ps = con.conectado().prepareStatement(select);
         res = ps.executeQuery();
         while(res.next()){
             registros = res.getString("nombre");
         }
         res.close();
         return registros;
      }catch(SQLException e){
         System.out.println(e);
      }
        return registros;
   }
    public String buscarID(String select){
       String registros = null;
      
      try{
         ps = con.conectado().prepareStatement(select);
         res = ps.executeQuery();
         while(res.next()){
             registros = res.getString("nombre");
         }
         res.close();
         return registros;
      }catch(SQLException e){
         System.out.println(e);
      }
        return registros;
   }
    public String buscarIDart(String select){
       String registros = null;
      
      try{
         ps = con.conectado().prepareStatement(select);
         res = ps.executeQuery();
         while(res.next()){
             registros = res.getString("id_articulo");
         }
         res.close();
         return registros;
      }catch(SQLException e){
         System.out.println(e);
      }
        return registros;
   }
    public String acceso(String select){
       String registros = null;
      
      try{
         ps = con.conectado().prepareStatement(select);
         res = ps.executeQuery();
         while(res.next()){
             registros = res.getString("nombre");
         }
         res.close();
         return registros;
      }catch(SQLException e){
         System.out.println(e);
      }
        return registros;
   }
    public Persona ConsultarProveedor(String SQL_READ) {
        Persona datos = null;
        
        try {

            ps = con.conectado().prepareStatement(SQL_READ);
            //ps.setString(1, key.toString());

            res = ps.executeQuery();

            while (res.next()) {
               datos = new Persona(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7));
            }
            return datos;
        } catch (SQLException e) {

            System.out.println(e);
        } 

        return datos;
    }
    public login ConsultarLogin(String SQL_READ) {
        login datos = null;
        
        try {

            ps = con.conectado().prepareStatement(SQL_READ);
            //ps.setString(1, key.toString());

            res = ps.executeQuery();

            while (res.next()) {
               datos = new login(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getInt(6),res.getString(7),res.getInt(8));
            }
            return datos;
        } catch (SQLException e) {

            System.out.println(e);
        } 

        return datos;
    }
    public Articulos[] ConsultarArticulo(String SQL_READALL) {
        Articulos[] datos = null;
		
		try {
			
                    ps = con.conectado().prepareStatement(SQL_READALL);

                    res = ps.executeQuery();
                    int i=0;
                    while (res.next()) {

                        datos[i] = new Articulos(res.getInt(1),res.getString(2),res.getInt(3),res.getInt(4),res.getInt(5),res.getInt(6),res.getString(7),res.getString(8));
                        i++;
                    }        
		} catch (SQLException e) {
			
                    JOptionPane.showMessageDialog(null, "Error al intentar consultar todos los materiales. \n"+e, null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		return datos;
    }
    public void actualizarArticulo(String SQL_UPDATE) {
         try {

            // Los numeros representan mis signos de interrogacion.
            ps = con.conectado().prepareStatement(SQL_UPDATE);
           

            // Retornar el valor boolean si esto se ejecuto.
            if (ps.executeUpdate() > 0) {

                JOptionPane.showMessageDialog(null, "Precios actualizados exitosamente", null, JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Precios actualizados exitosamente");
                
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al actualizar los precios.", null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Error al actualizar los precios. \n" + e);
        } 
    }
    
    
    public Object [][] GetTabla(String colName[], String tabla, String sql){
      int registros = 0;
      
      try{
         ps = con.conectado().prepareStatement("select count(*) as total from " + tabla);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }

    Object[][] data = new String[registros][colName.length];
    String col[] = new String[colName.length];
    
      try{
         ps = con.conectado().prepareStatement(sql);
         res = ps.executeQuery();
         int i = 0;
         while(res.next()){
            for(int j=0; j<=colName.length-1;j++){
                col[j] = res.getString(colName[j]);
                data[i][j] = col[j];
            }
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }
     
     public boolean existencias(String campo, String from_where){
     int registros = 0;
     try{
         ps = con.conectado().prepareStatement("SELECT count("+campo+") as total  " + from_where);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
     
     if (registros >0)
     {return true;
     }
     else
     {
         return false;
     }
  }
     public String datos_string(String nombre_columna, String sentenciasql){
        
    String datos ="";
      try{
         ps = con.conectado().prepareStatement(sentenciasql);
         res = ps.executeQuery();
         while(res.next()){
            datos = res.getString(nombre_columna);
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
    }
     
     public Object[] poblar_combox(String tabla, String nombrecol, String sql){
      int registros = 0;      
      try{
         ps = con.conectado().prepareStatement("SELECT count(*) as total FROM " + tabla);
         res = ps.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }

    Object[] datos = new Object[registros];
      try{
         ps = con.conectado().prepareStatement(sql);
         res = ps.executeQuery();
         int i = 0;
         while(res.next()){
            datos[i] = res.getObject(nombrecol);
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return datos;
 }
     
     public Double datos_totalfactura(String campo, String sql){
    double data =0;
      try{
         ps= con.conectado().prepareStatement(sql);
         res = ps.executeQuery();
         while(res.next()){
            data = res.getDouble(campo);
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
        
     
     
     }
    

