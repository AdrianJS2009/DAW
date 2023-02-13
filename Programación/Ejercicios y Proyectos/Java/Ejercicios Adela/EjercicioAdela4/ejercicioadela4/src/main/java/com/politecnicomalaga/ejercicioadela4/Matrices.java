package com.politecnicomalaga.ejercicioadela4;

import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class Matrices { 
    private int[][] matrizAleatoria; // Matriz de números aleatorios
    private char[][] matrizPrimo; // Matriz de caracteres que indica si el número de la matrizAleatoria es primo o no

    public Matrices() { 
        matrizAleatoria = new int[5][5]; 
        matrizPrimo = new char[5][5]; 
        Random random = new Random();

        // Rellenar matrizAleatoria con valores aleatorios
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) { // Rellena la matrizAleatoria con números aleatorios entre 1 y 100
                matrizAleatoria[i][j] = random.nextInt(100) + 1;
                matrizPrimo[i][j] = 'N';
            }
        }
    }
    // Comprueba si un número es primo
    public boolean isPrimo(int numero) { 
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Comprueba si el número es divisible por algún número entre 2 y su raíz cuadrada
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void rellenarMatrizPrimo() { // Rellena la matrizPrimo con S si el número de la matrizAleatoria es primo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (isPrimo(matrizAleatoria[i][j])) {
                    matrizPrimo[i][j] = 'S';
                }
            }
        }
    }

    public void mostrarMatrices() { // Muestra las matrices
        System.out.println("Matriz aleatoria:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizAleatoria[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz primo:"); // Muestra la matrizPrimo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizPrimo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
