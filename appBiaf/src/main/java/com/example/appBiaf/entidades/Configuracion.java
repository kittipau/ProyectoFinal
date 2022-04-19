package com.example.appBiaf.entidades;

import java.util.Date;

public class Configuracion {
    private Date fechafin;
    private String adminUserName;
    private String adminPass;

    public Configuracion() {
    }

    public Configuracion(Date fechafin, String adminUserName, String adminPass) {
        this.fechafin = fechafin;
        this.adminUserName = adminUserName;
        this.adminPass = adminPass;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }
}
