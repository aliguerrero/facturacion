/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Sentencias_sql;

/**
 *
 * @author Ali Guerrero
 */
public class Control_preguntas {
    
    private Sentencias_sql sen;
    private String id_pre;
    private String pregunta;

    public Control_preguntas() {
        sen = new Sentencias_sql();
    }

    public String getId_pre() {
        return id_pre;
    }

    public void setId_pre(String id_pre) {
        this.id_pre = id_pre;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public Object[] combox(String tabla, String campo){
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
    }
    
    
    
}
