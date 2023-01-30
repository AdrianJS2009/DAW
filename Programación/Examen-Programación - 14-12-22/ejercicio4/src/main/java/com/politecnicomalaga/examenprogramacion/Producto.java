package com.politecnicomalaga.examenprogramacion;

import java.util.Scanner;

public class Producto { 

    Scanner kb = new Scanner(System.in);
    private String nombre;
    private float precio;


    public void crearProducto() { // Método para crear un producto

        //Pedimos al usuario que introduzca los datos del producto y los guardamos en las variables nombre y precio.
        
        System.out.println("Introduce el nombre del producto: ");
        nombre = kb.nextLine();
        System.out.println("");
        System.out.println("Introduce el precio del producto sin usar el simbolo de los euros: "); 
        precio = kb.nextFloat();

        //Si precio es igual o menor que 0 y nombre está vacio, se mostrará un mensaje de error al introducir los datos.
        if (precio <= 0 || nombre.isEmpty()) {
            System.out.println("Error, el precio o el nombre no pueden estar vacios o ser negativos");
        }
        else {
            System.out.println("Producto creado correctamente");
        }     

    }

    public void aumentarPrecio() { 

        //Pedimos al usuario que introduzca el porcentaje de aumento y lo guardamos en la variable porcentaje.

        System.out.println("Introduce el porcentaje de aumento: ");
        double porcentaje = kb.nextFloat();
        precio += precio * porcentaje / 100;


        //Si porcentaje es igual o menor que 0, se mostrará un mensaje de error al introducir los datos.
        if (porcentaje <= 0) {
            System.out.println("Error, para aplicar el aumento sobre el producto, el porcentaje debe ser mayor que 0 y un número positivo");
        }
        else {
            System.out.println("Precio aumentado correctamente");
        }

        

        
    }

    public void rebajarPrecio() { 

        //Pedimos al usuario que introduzca el porcentaje de rebaja y lo guardamos en la variable porcentaje.
      
        System.out.println("Introduce el porcentaje de rebaja: ");
        double porcentaje = kb.nextFloat();
        precio -= precio * porcentaje / 100;


        //Si porcentaje es igual o menor que 0, se mostrará un mensaje de error al introducir los datos.
        if (porcentaje <= 0) {
            System.out.println("Error, para aplicar la rebaja sobre el producto, el porcentaje debe ser mayor que 0 y un número positivo");
        }
        else {
            System.out.println("Precio rebajado correctamente");
        }


    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

}
