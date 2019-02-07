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
public class registroRoot {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String username;
    protected String password;
    protected String codRoot;
    protected int    pregunta;
    protected String respuesta;

    public registroRoot(String nombre, String apellido, String cedula, String username, String password, String codRoot, int pregunta, String respuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.username = username;
        this.password = password;
        this.codRoot = codRoot;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCodRoot() {
        return codRoot;
    }

    public void setCodRoot(String codRoot) {
        this.codRoot = codRoot;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}
