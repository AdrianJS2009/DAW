/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.politecnicomalaga.gestionhotel;

import java.util.Scanner;

/**
 *
 * @author Ajimsan2009
 */
public class Manejodeclientes {

    public static void main(String[] args) {

        String dni, nombre, apellido, direccion, telefono, correo, fechanacimiento, edad;
        Integer menu;
        Scanner myScanner = new Scanner(System.in);
        Hotel myHotel = new Hotel();

        do {

            System.out.println("\n\n");
            System.out.println("1.Añadir cliente\n2.Eliminar cliente\n3.Mostrar clientes\n0.Salir\n");
            menu = myScanner.nextInt();
            myScanner.nextLine();

            switch (menu) {
                case 1:

                    System.out.println("\n\n");

                    System.out.print("\nIntroduce el DNI del cliente: ");
                    dni = myScanner.nextLine();

                    System.out.print("\nIntroduce el Nombre del cliente: ");
                    nombre = myScanner.nextLine();

                    System.out.print("\nIntroduce los Apellidos del cliente: ");
                    apellido = myScanner.nextLine();

                    System.out.print("\nIntroduce la dirección del cliente: ");
                    direccion = myScanner.nextLine();

                    System.out.print("\nIntroduce el Teléfono del cliente: ");
                    telefono = myScanner.nextLine();

                    System.out.print("\nIntroduce el Email del cliente: ");
                    correo = myScanner.nextLine();

                    System.out.print("\nIntroduce la Fecha de nacimiento del cliente: ");
                    fechanacimiento = myScanner.nextLine();

                    System.out.print("\nIntroduce la Edad del cliente: ");
                    edad = myScanner.nextLine();

                    System.out.println("\n\n");

                    myHotel.añadirCliente(dni, nombre, apellido, direccion, telefono, correo, fechanacimiento, edad);
                    break;

                case 2:

                    System.out.println("\n\n");
                    System.out.print("Introduce el DNI del cliente a eliminar: ");
                    dni = myScanner.nextLine();
                    myHotel.eliminarCliente(dni);
                    break;

                case 3:

                    System.out.println("\n\n");
                    myHotel.showClients();
                    break;

                default:

                    System.out.println("\n\n");
                    System.out.println("Introuduce un valor válido...");

            }

        } while (menu != 0);
    }
}
