package com.example.appBiaf.entidades;

public class Diseño {

    private int diseñoID;
    private String nombre;
    private String descripcion;

    public Diseño() {
    }

    public Diseño(int diseñoID, String nombre, String descripcion) {
        this.diseñoID = diseñoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getDiseñoID() {
        return diseñoID;
    }

    public void setDiseñoID(int diseñoID) {
        this.diseñoID = diseñoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
