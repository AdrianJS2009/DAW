package com.politecnicomalaga.tema10ejer1;

import java.util.Scanner;

public class MainStringRepetido {
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
                StringRepetido sr = new StringRepetido(input, repeticiones);
                System.out.println(sr.imprime());
            }
        }
        scanner.close();
    }
}