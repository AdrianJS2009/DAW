package com.politecnicomalaga.ejercicioadela4;

import java.util.Random;

public class Matrices {
    private int[][] matrizAleatoria;
    private char[][] matrizPrimo;

    public Matrices() {
        matrizAleatoria = new int[5][5];
        matrizPrimo = new char[5][5];
        Random random = new Random();

        // Rellenar matrizAleatoria con valores aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizAleatoria[i][j] = random.nextInt(100) + 1;
                matrizPrimo[i][j] = 'N';
            }
        }
    }

    public boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void rellenarMatrizPrimo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (isPrimo(matrizAleatoria[i][j])) {
                    matrizPrimo[i][j] = 'S';
                }
            }
        }
    }

    public void mostrarMatrices() {
        System.out.println("Matriz aleatoria:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizAleatoria[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz primo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizPrimo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
