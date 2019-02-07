/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Sentencias_sql;
import controlador.conexion;
import controlador.login;
import controlador.registroRoot;

/**
 *
 * @author Ali Guerrero
 */
public class Control_registroRoot  extends registroRoot{
  
     private Sentencias_sql sql; 
     
      conexion conn = new conexion();

    public Control_registroRoot(String nombre, String apellido, String cedula, String username, String password, String codRoot, int pregunta, String respuesta) {
        super(nombre, apellido, cedula, username, password, codRoot, pregunta, respuesta);
        sql = new Sentencias_sql();
    }

   


    public boolean ingresar_root(){               
        
            String datos[] = {nombre,apellido,cedula,username,password,codRoot,String.valueOf(pregunta),respuesta};           
            return sql.insertar(datos, "insert into user_root(nombre, apellido,cedula, username, password,codigo_root, pregunta_seg, respuesta) values(?,?,?,?,?,?,?,?)");            
    }
    
    public Object[][] consulta_root(){
        String[] columnas={"Nombre","Apellido","Cedula","Username"};
        Object[][] datos = sql.GetTabla(columnas, "user_root", "select nombre,apellido,cedula,username from login where username=? and password=?");
        return datos;
    }
    public String consultaTodo_root(){
                   
        return sql.buscar("SELECT * FROM user_root");     
    }
    public String consulta_root_id(String cod){
        
        return sql.buscarID( "select * from user_root where codigo_root='"+cod+"'"); 
    }
    public String consulta_loginUSER(String user){
        return sql.buscarID("select * from login where username='"+user+"'");
    }
    public Object[] combox(String tabla, String campo)
    {
       return sql.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
    }
     
    
    

}
