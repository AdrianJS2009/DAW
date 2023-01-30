package com.politecnicomalaga.ejerciciosadela5;

public class Main {
    public static void main(String[] args) {
        ComproColumna comproColumna = new ComproColumna();
        int resultado = comproColumna.comproColumna(comproColumna.getMatriz(), comproColumna.getColumna());

        if (resultado == -1) {
            System.out.println("No hay ninguna columna igual.");
        } else {
            System.out.println("La columna igual es la columna " + resultado);
        }
    }
}