/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Sentencias_sql;
import controlador.conexion;
import controlador.login;

/**
 *
 * @author Ali Guerrero
 */
public class Control_login  extends login{
  
     private Sentencias_sql sql; 
     
      conexion conn = new conexion();

    public Control_login(String nombre, String apellido,String cedula, String username, String password, int preg_secrt, String respt_secrt, int status) {
        super(nombre, apellido, cedula, username, password, preg_secrt, respt_secrt, status);
        sql = new Sentencias_sql();
    }


    public boolean ingresar_login(){               
        
            String datos[] = {nombre,apellido,cedula,username,password,String.valueOf(preg_secrt),respt_secrt,String.valueOf(status)};           
            return sql.insertar(datos, "insert into login(nombre, apellido,cedula_login, username, password, pregunta_seg, respuesta_seg,tipo_acceso) values(?,?,?,?,?,?,?,?)");            
    }
    
    public Object[][] consulta_login(String user , String pass){
        String[] columnas={"Nombre","Apellido","Cedula","Username"};
        Object[][] datos = sql.GetTabla(columnas, "login", "select nombre,apellido,cedula_login,username from login where username='"+user+"'"+"and password='"+pass+"'");
        return datos;
    }
    
    public String consulta_loginUSER(String user){
        return sql.buscarID("select * from login where username='"+user+"'");
    }
    public login acceso_login(String user, String pass){
        return sql.ConsultarLogin("select * from login where username='"+user+"'"+"and password='"+pass+"'");
    }
    
    public Object[] combox(String tabla, String campo)
    {
       return sql.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
    }
     
    
    

}
