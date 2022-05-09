package com.example.appBiaf;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente extends Thread {

    public Cliente() {
    }

    @Override
    public void run() {
        try {

            String equipoServidor = "127.0.0.1";
            int puertoServidor = 30500;

            /** Se abre un socket en el cliente, y dicho socket establece
             "una conexión con el socket del servidor situado en el puerto 30500 de la 127.0.0.1" */
            Socket socketCliente = new Socket(equipoServidor, puertoServidor);
            gestionarComunicacion(socketCliente,equipoServidor);

            //Se cierra el cliente
            socketCliente.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        public void gestionarComunicacion (Socket socketCliente, Object objeto) {
            try {
                //El cliente contruye el objetco y lo envia al servidor
                ObjectOutputStream oos = new ObjectOutputStream(socketCliente.getOutputStream());
                oos.writeObject(objeto);

                //El cliente recibe un objeto del servidor
                ObjectInputStream ois = new ObjectInputStream(socketCliente.getInputStream());
                // Se lee el objeto recibido
                objeto  = (Object) ois.readObject();

                //Se cierra la comunicación
                ois.close();
                oos.close();
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
