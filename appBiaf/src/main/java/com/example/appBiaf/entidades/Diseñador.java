package com.example.appBiaf.entidades;

public class Diseñador {

    private int diseñadorID;
    private String alias;
    private String descripcion;
    private Diseño diseño;

    public Diseñador() {
    }

    public Diseñador(int diseñadorID, String alias, String descripcion, Diseño diseño) {
        this.diseñadorID = diseñadorID;
        this.alias = alias;
        this.descripcion = descripcion;
        this.diseño = diseño;
    }

    public int getDiseñadorID() {
        return diseñadorID;
    }

    public void setDiseñadorID(int diseñadorID) {
        this.diseñadorID = diseñadorID;
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

    public Diseño getDiseño() {
        return diseño;
    }

    public void setDiseño(Diseño diseño) {
        this.diseño = diseño;
    }

}
