package com.example.appBiaf.entidades;

import java.util.Date;

public class Configuracion {
    private Date fechafin;


    public Configuracion() {
    }

    public Configuracion(Date fechafin) {
        this.fechafin = fechafin;

    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
}
