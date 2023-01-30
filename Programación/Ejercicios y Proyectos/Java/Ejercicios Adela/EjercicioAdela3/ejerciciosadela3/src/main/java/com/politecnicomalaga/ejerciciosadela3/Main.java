package com.politecnicomalaga.ejerciciosadela3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[10];
        Random r = new Random();
        ArrayHelper arrayHelper = new ArrayHelper();

        // Genera 10 números entre 2 y 10 y los almacena en el array
        for (int i = 0; i < 10; i++) {
            arrayNumeros[i] = r.nextInt(9) + 2;
        }

        // Muestra el contenido del array junto al índice
        System.out.println("Array original: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Indice: " + i + " - Valor: " + arrayNumeros[i]);
        }

        // Mueve los números primos a las primeras posiciones
        arrayHelper.movePrimeNumbersToStart(arrayNumeros);

        // Muestra el array resultante
        System.out.println("Array resultante: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Indice: " + i + " - Valor: " + arrayNumeros[i]);
        }
    }
}