/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private  String description, name, address, phone, email;
    List<Client> client;

    public Hotel() {

        this.client = new ArrayList<Client>();

    }

    public void showClients() {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {


                if (Boolean.parseBoolean(client.get(i).getClientInformation()[8])) {

                    System.out.println("Promoción: Aplicada");

                } else {

                    System.out.println("Promoción: No Aplicada");

                }
            }

        } else {

            System.out.println("\n\nNo hay clientes registrados...");

        }

    }

    public void addClient(String dni, String name, String surname, String address, String phone, String email, String birthdate, String age) {

        client.add(new Client(dni, name, surname, address, email, phone, birthdate, age));

    }

    public void removeClient(String dni) {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                if (client.get(i).getClientInformation()[0].equals(dni)) {

                    System.out.println("\n\n");
                    System.out.println("Se ha eliminado a " + client.get(i).getClientInformation()[1] + " " + client.get(i).getClientInformation()[2]);
                    System.out.println("\n\n");

                    client.remove(client.get(i));

                } else {

                    System.out.println("No se ha encontrado al cliente deseado...\nRevise el DNI introducido (Key Sensitive).");

                }

            }

        } else {

            System.out.println("\n\nNo hay registrado ningún cliente.\n");

        }

    }

    public void changeDiscount(String dni) {

        if (!client.isEmpty()) {

            for (int i = 0; i < client.size(); i++) {

                if (client.get(i).getClientInformation()[0].equals(dni)) {

                    if (Integer.parseInt(client.get(i).getClientInformation()[7]) >= 18 && Integer.parseInt(client.get(i).getClientInformation()[7]) <= 28) {

                        if (!Boolean.parseBoolean(client.get(i).getClientInformation()[8])) {

                            client.get(i).applyDiscount();
                            System.out.println("\n\nSe ha aplicado el descuento.\n");
                            break;

                        } else {

                            System.out.println("\n\nEl cliente ya tiene la promoción aplicada.\n");

                        }

                    } else {

                        System.out.println("\n\nEl cliente no tiene la edad requerida para aplicarse el descuento.\n");

                    }

                }

            }

        } else {

            System.out.println("\n\nNo hay registrado ningún cliente.\n");

        }

    }

    public List<Client> getClients() {
        return this.client;
    }

}
