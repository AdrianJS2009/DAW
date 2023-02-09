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
                    //boolean tieneComplementario = sorteo.tieneComplementario(boleto);

                    if (aciertos == 6) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el primer premio!");
                    } else if (aciertos == 5) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el segundo premio!");
                    } else if (aciertos == 4) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el tercer premio!");
                    } else if (aciertos == 3) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el cuarto premio!");
                    } else if (aciertos == 2) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el quinto premio!");
                    } else if (aciertos == 1) {
                        System.out.println("¡Enhorabuena! ¡Has ganado el sexto premio!");
                    } else {
                        System.out.println("Lo siento, no has acertado ningún número");
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