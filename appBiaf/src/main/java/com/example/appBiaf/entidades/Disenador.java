package com.example.appBiaf.entidades;

public class Disenador {

    private int disenadorID;
    private String alias;
    private String descripcion;
    private Diseno diseno;

    public Disenador() {
    }

    public Disenador(int disenadorID, String alias, String descripcion, Diseno diseno) {
        this.disenadorID = disenadorID;
        this.alias = alias;
        this.descripcion = descripcion;
        this.diseno = diseno;
    }

    public int getDisenadorID() {
        return disenadorID;
    }

    public void setDisenadorID(int disenadorID) {
        this.disenadorID = disenadorID;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Diseno getDiseño() {
        return diseno;
    }

    public void setDiseño(Diseno diseno) {
        this.diseno = diseno;
    }

}
