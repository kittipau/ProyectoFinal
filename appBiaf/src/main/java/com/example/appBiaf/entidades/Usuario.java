package com.example.appBiaf.entidades;

/**
 * Clase Usuario con los atributos, id, nombre de usuario, email, contraseña y  avatar
 */
public class Usuario {
    private int usuarioID;
    private String userName;
    private String email;
    private String contraseña;
    private Diseno diseno;


    /**
     * Constructor de Usuario con todos los parámetros menos id y votacion
     * @param usuario
     * @param email
     * @param contraseña
     */
    public Usuario(String usuario, String email, String contraseña) {
        this.userName = usuario;
        this.email = email;
        this.contraseña = contraseña;
    }

    /**
     * Constructor de Usuario con todos los parámetros menos id
     * @param usuario
     * @param email
     * @param contraseña
     * @param diseno
     */
    public Usuario(String usuario, String email, String contraseña, Diseno diseno) {
        this.userName = usuario;
        this.email = email;
        this.contraseña = contraseña;
        this.diseno = diseno;
    }

    /**
     * Constructor vacío de usuario
     */
    public Usuario() {
    }


    /**
     * getter usuario
     * @return usuario nombre del usuario
     */
    public String getUsuario() {
        return userName;
    }

    /**
     * setter usuario
     * @param usuario nombre del usuario
     */
    public void setUsuario(String usuario) {
        this.userName = usuario;
    }

    /**
     * getter email
     * @return email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter email
     * @param email del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter contraseña
     * @return contraseña del usuario
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * setter contraseña
     * @param contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * getter del id del usuario
     * @return usuarioID del usuario
     */
    public int getUsuarioID() {
        return usuarioID;
    }

    /**
     * setter del id del usuario
     * @param usuarioID del usuario
     */
    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    /**
     * getter del id del usuario
     * @return userName del usuario
     */
    public String getUserName() {
        return userName;
    }

    /**
     * setter del nombre del usuario
     * @param userName del usuario
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * getter del diseño que ha votado el usuario
     * @return diseño votado por el usuario
     */
    public Diseno getDiseño() {
        return diseno;
    }

    /**
     * setter del diseño votado por el usuario
     * @param diseno votado por el usuario
     */
    public void setDiseño(Diseno diseno) {
        this.diseno = diseno;
    }
}
