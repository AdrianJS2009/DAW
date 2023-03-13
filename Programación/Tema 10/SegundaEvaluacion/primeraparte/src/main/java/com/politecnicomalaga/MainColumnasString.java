package com.politecnicomalaga;

import java.util.Scanner;

public class MainColumnasString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("stop")) {
            System.out.println("Introduce una cadena de texto o escribe 'stop' para salir:");
            input = scanner.nextLine();
            if (!input.equals("stop")) {
                System.out.println("Introduce un número entero:");
                int repeticiones = scanner.nextInt();
                scanner.nextLine();
                ColumnasString sr = new ColumnasString(input, repeticiones);
                System.out.println(sr.imprime());
            }
        }
        scanner.close();
    }
}