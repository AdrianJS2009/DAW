package com.politecnicomalaga;

import java.util.Scanner;

public class MainCodificarEspejo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("stop")) {
            System.out.println("Introduce una cadena de texto o escribe 'stop' para salir:");
            input = scanner.nextLine();
            if (!input.equals("stop")) {
                CodificarEspejo codificador = new CodificarEspejo(input);
                System.out.println(codificador.codifica());
            }
        }
        scanner.close();
    }
}
