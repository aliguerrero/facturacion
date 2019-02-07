/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Ali Guerrero
 */
public class login {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String username;
    protected String password;
    protected int    preg_secrt;
    protected String respt_secrt;
    protected int    status; 

    public login(String nombre, String apellido, String cedula, String username, String password, int preg_secrt, String respt_secrt, int status) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.username = username;
        this.password = password;
        this.preg_secrt = preg_secrt;
        this.respt_secrt = respt_secrt;
        this.status = status;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

   
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPreg_secrt() {
        return preg_secrt;
    }

    public void setPreg_secrt(int preg_secrt) {
        this.preg_secrt = preg_secrt;
    }

    public String getRespt_secrt() {
        return respt_secrt;
    }

    public void setRespt_secrt(String respt_secrt) {
        this.respt_secrt = respt_secrt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

   

   
}
