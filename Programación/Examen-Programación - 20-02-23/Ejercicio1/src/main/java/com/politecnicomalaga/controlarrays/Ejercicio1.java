package com.politecnicomalaga.controlarrays;

import java.util.Scanner;

public class Ejercicio1 {
    static final int filas = 6;
    static final int columnas = 6;
    static double[][] lista = new double[filas][columnas];


    // Menú de opciones
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Programa para simulación de sensores en malla de 6x6:\n" +
                    "0. Salir\n" +
                    "1. Inicializar tabla.\n" +
                    "2. Mostrar tabla.\n" +
                    "3. Máximo, Mínimo.\n" +
                    "4. Medias por fila.\n" +
                    "Introduce la opción que quieras ejecutar.");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    iniciarTabla();
                    break;
                case 2:
                    mostrarTabla();
                    break;
                case 3:
                    mostrarMinMax();
                    break;
                case 4:
                    mostrarMedia();
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige una opción del menú.");
                    break;
            }
        } while (opcion != 0);
    }
    // Inicializa la tabla con valores aleatorios entre 0 y 1000
    private static void iniciarTabla() {
        
        // Recorre la tabla para inicializarla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) { // Inicializamos la tabla con valores aleatorios entre 0 y 1000
                lista[i][j] = Math.random() * 1000;
            }
        }
        System.out.println("Tabla iniciada.");
    }
    private static void mostrarTabla() {
        System.out.println("Tabla generada:");
        
        // Recorre la tabla para mostrarla por pantalla
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println("\n"); // Espacio en blanco para poder mostrar en pantalla de forma más clara la tabla
        }
        System.out.println(); // Espacio en blanco para poder mostrar en pantalla de forma más clara la tabla
    }
    // Muestra el valor máximo y mínimo de la tabla junto con su posición
    private static void mostrarMinMax() {
        double max = Double.MIN_VALUE; // Valor mínimo de un double
        double min = Double.MAX_VALUE; // Valor máximo de un double
        int maxfilas = 0;
        int maxcolumnas = 0;
        int minfilas = 0;
        int mincolumnas = 0;

        // Recorre la tabla para encontrar el valor máximo y mínimo
        for (int i = 0; i < filas; i++) { 
            for (int j = 0; j < columnas; j++) {
                if (lista[i][j] > max) {
                    max = lista[i][j]; // Guardo el valor máximo
                    maxfilas = i; // Guardo la fila del valor máximo
                    maxcolumnas = j; // Guardo la columna del valor máximo
                }
                if (lista[i][j] < min) {
                    min = lista[i][j]; // Guardo el valor mínimo
                    minfilas = i; // Guardo la fila del valor mínimo
                    mincolumnas = j; // Guardo la columna del valor mínimo
                }
            }
        }
        System.out.println("El valor máximo es " + max + " en la posición (" + maxfilas + ", " + maxcolumnas + ")");
        System.out.println("El valor mínimo es " + min + " en la posición (" + minfilas + ", " + mincolumnas + ")");
    }
    
    // Recorre la tabla para calcular la media de cada fila
    private static void mostrarMedia() {
        for (int i = 0; i < filas; i++) { 
            double sumafila = 0; // Variable para guardar la suma de los valores de cada fila
            for (int j = 0; j < columnas; j++) { // Recorro la fila para sumar los valores
                sumafila += lista[i][j]; // Sumo los valores de la fila
            }
            double media = sumafila / columnas; // Calculo la media de la fila
            System.out.println("La media aritmética de la fila " + i + " es " + media);
        }
    }
}
