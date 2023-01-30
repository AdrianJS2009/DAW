package com.politecnicomalaga.loteriaprimtitivaorientadoaobjetos;

import java.util.Scanner;

public class Primitiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorteo sorteo = new Sorteo();
        int opcion;

        do {
            System.out.println("1. Generar combinación ganadora");
            System.out.println("2. Mostrar combinación ganadora");
            System.out.println("3. Comprobar boleto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sorteo.generarCombinacionGanadora();
                    System.out.println("Combinación ganadora generada");
                    break;
                case 2:
                    sorteo.mostrarCombinacionGanadora();
                    break;
                case 3:
                    System.out.println("Introduce los números de tu boleto:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();
                    int num5 = scanner.nextInt();
                    int num6 = scanner.nextInt();
                    Boleto boleto = new Boleto(num1, num2, num3, num4, num5, num6);
                    int aciertos = sorteo.comprobarAciertos(boleto);
                    boolean tieneComplementario = sorteo.tieneComplementario(boleto);

                    if (aciertos == 6) {
                        System.out.println("¡Enhorabuena, has ganado el gordo con 6 aciertos!");
                    } else if (aciertos == 5 && tieneComplementario) {
                        System.out.println("¡Enhorabuena, has ganado con 5 aciertos más complementario!");
                    } else if (aciertos == 5) {
                        System.out.println("¡Enhorabuena, has ganado con 5 aciertos!");
                    } else if (aciertos == 4) {
                        System.out.println("¡Enhorabuena, has ganado con 4 aciertos!");
                    } else if (aciertos == 3) {
                        System.out.println("¡Enhorabuena, has ganado con 3 aciertos!");
                    } else {
                        System.out.println("Lo siento, no ha habido ningún acierto.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
        scanner.close();
    }
}