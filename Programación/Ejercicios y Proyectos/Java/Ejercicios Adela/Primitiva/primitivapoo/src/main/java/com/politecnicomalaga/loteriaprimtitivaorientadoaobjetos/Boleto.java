package com.politecnicomalaga.loteriaprimtitivaorientadoaobjetos;

public class Boleto {
    private int[] numeros = new int[6];

    public Boleto(int num1, int num2, int num3, int num4, int num5, int num6) {
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;
        numeros[4] = num5;
        numeros[5] = num6;
    }

    public int getNumero(int posicion) {
        return numeros[posicion];
    }
}