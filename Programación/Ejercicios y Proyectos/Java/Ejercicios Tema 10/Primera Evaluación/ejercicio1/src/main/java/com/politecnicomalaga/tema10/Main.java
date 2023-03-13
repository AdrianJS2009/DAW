package com.politecnicomalaga.ejertema10;

import java.util.Scanner;

public class MainMezclaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("stop")) { // Mientras no se introduzca la palabra stop se seguirá ejecutando el programa.
            System.out.print("Introduce una cadena de texto: ");
            input = scanner.nextLine(); // Se guarda la cadena de texto introducida por el usuario
            if (!input.equals("stop")) { 
                System.out.print("Introduce un número entero: ");
                int repeticiones = scanner.nextInt(); // Se guarda el número de repeticiones
                scanner.nextLine(); 
                ColumnasString columna = new ColumnasString(input, repeticiones); // Crea un objeto de la clase ColumnasString con los parámetros introducidos por el usuario
                System.out.println(columna.imprime()); // Imprime la columna de caracteres con el método imprime de la clase ColumnasString 
            }
        }
    }
}