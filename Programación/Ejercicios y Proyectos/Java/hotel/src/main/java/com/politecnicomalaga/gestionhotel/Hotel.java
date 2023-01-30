/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

import java.util.ArrayList;

/**
 *
 * @author Ajimsan2009
 */
public class Hotel {

    private final String descripcion, nombre, telefono, correo, direccion;
    private final ArrayList<Cliente> client;

    public Hotel() {

        this.descripcion = "Hotel que se encuentra a 1,6 KM de la Malagueta.";
        this.nombre = "Hotel Barceló.";
        this.direccion = "Calle Aranjuez, 14, 29006 Málaga";
        this.telefono = "910 15 27 89";
        this.correo = "Barceloresourt@gmail.es";
        this.client = new ArrayList<>();

    }

    public void showClients() {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                System.out.println("\n\nDNI: " + client.get(i).getClientInformation()[0]);
                System.out.println("Nombre: " + client.get(i).getClientInformation()[1]);
                System.out.println("Apellidos: " + client.get(i).getClientInformation()[2]);
                System.out.println("Dirección: " + client.get(i).getClientInformation()[3]);
                System.out.println("Teléfono: " + client.get(i).getClientInformation()[4]);
                System.out.println("Email: " + client.get(i).getClientInformation()[5]);
                System.out.println("Fecha de Nacimiento: " + client.get(i).getClientInformation()[6]);
                System.out.println("Edad: " + client.get(i).getClientInformation()[7]);

                

                
                }
            } else {

            System.out.println("\n\nNo hay información de ese cliente.");

        }

    }

    public void añadirCliente(String dni, String nombre, String apellido, String direccion, String telefono, String correo, String fechanacimiento, String edad) {

        client.add(new Cliente(dni, nombre, apellido, direccion, correo, telefono, fechanacimiento, edad));

    }

    public void eliminarCliente(String dni) {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                if (client.get(i).getClientInformation()[0].equals(dni)) {

                    System.out.println("\n\n");
                    System.out.println("Datos eliminados sobre el cliente: " + client.get(i).getClientInformation()[1] + " " + client.get(i).getClientInformation()[2]);
                    System.out.println("\n\n");

                    client.remove(client.get(i));

                } else {

                    System.out.println("La búsqueda no ha encontrado ninguna coincidencia, \nRevise los datos introducidos, cuidado con las letras mayusculas.");

                }

            }

        } else {

            System.out.println("\n\nNo se ha encontrado ningún cliente.\n");

        }

    }

}
