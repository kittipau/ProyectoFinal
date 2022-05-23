package com.example.appBiaf.entidades;

import android.media.Image;

public class Diseno {

    private int diseñoID;
    private String nombre;
    private String descripcion;
    private Image Imagen;

    public Diseno() {
    }

    public Diseno(int diseñoID, String nombre, String descripcion) {
        this.diseñoID = diseñoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getDisenoID() {
        return diseñoID;
    }

    public void setDisenoID(int diseñoID) {
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
