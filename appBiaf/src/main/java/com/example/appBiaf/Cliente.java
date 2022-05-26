package com.example.appBiaf;

import com.google.android.material.snackbar.Snackbar;


import pojos.Configuracion;
import pojos.Participante;
import pojos.Usuario;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente extends Thread {

    String opcion=""; // 1 insertar usurio
    Usuario usuario;
    Participante participante;
    Configuracion configuracion;

    public Cliente() {
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void run() {
        try {
            String equipoServidor = "192.168.0.26";
            String equiposervidor2 = "10.190.34.80";
            int puertoServidor = 30500;
            /** Se abre un socket en el cliente, y dicho socket establece
             "una conexión con el socket del servidor si tuado en el puerto 30500 de la 127.0.0.1" */
            Socket socketCliente = new Socket(equiposervidor2, puertoServidor);

            //Preparo el envio de datos
            OutputStream os = socketCliente.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);


            if (opcion.equals("1") || opcion.equals("2")){
                dos.writeUTF(opcion);
                dos.close();
                InsertaryEliminar(socketCliente,usuario);

            } else if (opcion.equals("3")){
                //iniciar sesión
                dos.writeUTF(opcion);
                dos.close();
                mostrarDisenador(socketCliente, participante);
            }

            //Se cierra el cliente

            socketCliente.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método para enviar un Usuario
     * @param socketCliente
     * @param usuario
     */
    public void InsertaryEliminar (Socket socketCliente, Usuario usuario) {
        try {
            //El cliente contruye el objetco y lo envia al servidor
            ObjectOutputStream oos = new ObjectOutputStream(socketCliente.getOutputStream());
            oos.writeObject(usuario);
            //Se cierra la comunicación
            oos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Usuario IniciarSesion (Socket socketCliente, Usuario usuario) {
        Usuario u = new Usuario();
        try {
            //El cliente contruye el objetco y lo envia al servidor
            ObjectOutputStream oos = new ObjectOutputStream(socketCliente.getOutputStream());
            oos.writeObject(usuario);


            //Espero el objeto completo
            ObjectInputStream ois = new ObjectInputStream(socketCliente.getInputStream());
            u = (Usuario) ois.readObject();

            //Se cierra la comunicación
            oos.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return u;
    }

    public Participante mostrarDisenador (Socket socketCliente, Participante participante) {
        Participante p = new Participante();

        try {
            //El cliente contruye el objetco y lo envia al servidor
            ObjectOutputStream oos = new ObjectOutputStream(socketCliente.getOutputStream());
            DataOutputStream dos = new DataOutputStream(socketCliente.getOutputStream());
            oos.writeObject(participante);

            //Espero el objeto completo
            ObjectInputStream ois = new ObjectInputStream(socketCliente.getInputStream());
            p = (Participante) ois.readObject();

            //Se cierra la comunicación
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    public Participante listarDisenadores (Socket socketCliente, String nombre) {
        Participante p = new Participante();

        try {
            //El cliente contruye el objetco y lo envia al servidor
            DataOutputStream dos = new DataOutputStream(socketCliente.getOutputStream());
            dos.writeUTF(nombre);

            //Espero el objeto completo
            ObjectInputStream ois = new ObjectInputStream(socketCliente.getInputStream());
            p = (Participante) ois.readObject();

            //Se cierra la comunicación
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }

    }

