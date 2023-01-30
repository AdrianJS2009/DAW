package com.politecnicomalaga.examenprogramacion;

import java.util.Scanner;

public class Ejercicio4 
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);

        // Creamos dos objetos de la clase Producto

        Producto producto1 = new Producto(); 
        Producto producto2 = new Producto(); 

        int opcion = 0;
        do {
            System.out.println("1. Crear producto 1."); 
            System.out.println("2. Crear producto 2.");
            System.out.println("3. Aumentar precio producto 1");
            System.out.println("4. Aumentar precio producto 2");
            System.out.println("5. Rebajar precio producto 1");
            System.out.println("6. Rebajar precio producto 2");
            System.out.println("7. Mostrar datos de los productos (de los dos)");
            System.out.println("8. Salir");
            opcion = kb.nextInt();
            switch (opcion) {
                case 1:
                    producto1.crearProducto();
                    break;
                case 2:
                    producto2.crearProducto();
                    break;
                case 3:
                    producto1.aumentarPrecio();
                    break;
                case 4:
                    producto2.aumentarPrecio();
                    break;
                case 5:
                    producto1.rebajarPrecio();
                    break;
                case 6:
                    producto2.rebajarPrecio();
                    break;
                case 7:
                    producto1.mostrarDatos();
                    producto2.mostrarDatos();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 8);
    }
}
