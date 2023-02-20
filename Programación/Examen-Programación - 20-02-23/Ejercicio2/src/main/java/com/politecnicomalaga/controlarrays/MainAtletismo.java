package com.politecnicomalaga.controlarrays;

import java.util.Scanner;

public class MainAtletismo {

    public static void main(String[] args) {

        Corredor corredor = new Corredor("", "", "", "", "");

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nGestión de carreras");
            System.out.println("0. Salir");
            System.out.println("1. Añadir/Modificar datos corredor");
            System.out.println("2. Añadir carrera");
            System.out.println("3. Mostrar todas las carreras");
            System.out.println("4. Buscar carrera");
            System.out.print("Introduzca la opción que desee ejecutar: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    scanner.nextLine();
                    System.out.print("Introduzca el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca los apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Introduzca el DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Introduzca el teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Introduzca el email: ");
                    String email = scanner.nextLine();

                    // Se actualizan los datos del corredor.
                    corredor.setNombre(nombre); 
                    corredor.setApellidos(apellidos); 
                    corredor.setDni(dni); 
                    corredor.setTelefono(telefono);
                    corredor.setEmail(email);

                    System.out.println("Datos actualizados correctamente.");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Introduzca el código de la carrera (4 carácteres alfanúmericos): ");
                    String codigo = scanner.nextLine();
                    System.out.print("Introduzca la distancia en metros: ");
                    int distancia = scanner.nextInt();
                    System.out.print("Introduzca el tiempo en segundos: ");
                    int tiempo = scanner.nextInt();
                    System.out.print("Introduzca la pendiente media (Entre 0 y 10): ");
                    byte pendiente = scanner.nextByte();
                    System.out.print("Introduzca el dorsal (Número entre 100 y 999): ");
                    short dorsal = scanner.nextShort();

                    // Si la carrera se añade correctamente, se muestra un mensaje de confirmación, si no, se muestra un mensaje de error.
                    if (corredor.addCarrera(codigo, distancia, tiempo, pendiente, dorsal)) { 
                        System.out.println("Carrera añadida correctamente.");
                    } else {
                        System.out.println("Error al añadir la carrera. Compruebe los datos y intentalo de nuevo.");
                    }
                    break;
                case 3:
                    //Si el array de carreras está vacío, se muestra un mensaje de que no hay carreras todavía, si no, se muestran todas las carreras.
                    String[] carreras = corredor.mostrarCarreras();
                    if (carreras == null) {
                        System.out.println("No se han realizado carreras todavia.");
                    } else {
                        for (String carrera : carreras) {
                            System.out.println(carrera);
                        }
                    }
                    break;
                case 4:
                    //Si la carrera no se encuentra, se muestra un mensaje de error, en caso contrario, se muestra la carrera.
                    scanner.nextLine();
                    System.out.print("Introduce el código de la carrera a buscar: ");
                    String codigoBuscado = scanner.nextLine();
                    Carrera carreraBuscada = corredor.buscarCarrera(codigoBuscado);
                    if (carreraBuscada == null) {
                        System.out.println("Carrera no encontrada.");
                    } else {
                        System.out.println(carreraBuscada);
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

}
