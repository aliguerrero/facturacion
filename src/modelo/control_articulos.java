/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Articulos;
import controlador.Sentencias_sql;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class control_articulos {
    
    
    Sentencias_sql sensql;
   
    public control_articulos() {
        
        sensql = new Sentencias_sql();
    }

    
    /**
     *
     * @param id
     */
    
    public boolean ingresar_articulo(int id, String descripcion, int precioventa, int preciocosto, int stock, String tipoart, String codprov, String fechaingreso)
    {               
        
        String datos[] = {Integer.toString(id),descripcion,Integer.toString(precioventa),Integer.toString(preciocosto),Integer.toString(stock),tipoart,codprov,fechaingreso};           
        return sensql.insertar(datos, "insert into articulo(id_articulo, descripcion, precio_venta,precio_costo, stock, cod_tipo_articulo, cod_proveedor, fecha_ingreso) values(?,?,?,?,?,?,?,?)");  
    }
    
    public Object[][] consulta_articulos(){
        String[] columnas={"id_articulo","descripcion","precio_venta","precio_costo","stock","descripcion_articulo","Nombre_comercial","fecha_ingreso"};
        Object[][] datos = sensql.GetTabla(columnas, "articulo", "select id_articulo,descripcion,articulo.precio_venta,precio_costo,stock,descripcion_articulo,Nombre_comercial,fecha_ingreso from articulo,proveedor,tipo_articulo where id_tipoarticulo=cod_tipo_articulo and No_documento=cod_proveedor;");
        return datos;
    }
    
    public String consulta_articuloID(String id){
        return sensql.buscarIDart("select * from articulo where id_articulo='"+id+"'");
    }
    public Articulos[] datos_articulos(){
        return sensql.ConsultarArticulo("select * from articulo");
    }
    public void actualizar_articulos_pre(int id,int pre){
        sensql.actualizarArticulo("UPDATE articulo SET `precio_venta`='"+pre+"where='"+id+"'");
    }
}