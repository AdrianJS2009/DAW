package com.politecnicomalaga.loteriaprimtitivaorientadoaobjetos;

import java.util.Random;

public class Sorteo {
    private int[] combinacionGanadora = new int[7];

    // Genera una combinación ganadora aleatoria
    public void generarCombinacionGanadora() {
        Random aleatorio = new Random();
        int[] numeros = new int[49];

        // Rellenamos el array con los números del 1 al 49
        for (int i = 0; i < 49; i++) {
            numeros[i] = i + 1;
        }

        // Generamos los 6 números de la combinación ganadora
        for (int i = 0; i < 6; i++) {
            int posicionAleatoria = aleatorio.nextInt(49 - i); // Generamos una posición aleatoria
            combinacionGanadora[i] = numeros[posicionAleatoria]; // Guardamos el número de esa posición
            numeros[posicionAleatoria] = numeros[48 - i]; // Intercambiamos el número de esa posición con el último número del array
        }
        combinacionGanadora[6] = aleatorio.nextInt(49) + 1; // Generamos el complementario
    }

    // Muestra por pantalla la combinación ganadora
    public void mostrarCombinacionGanadora() {
        for (int i = 0; i < 7; i++) {
            System.out.print(combinacionGanadora[i] + " ");
        }
        System.out.println();
    }

    // Comprueba cuántos aciertos tiene el boleto con respecto a la combinación ganadora
    public int comprobarAciertos(Boleto boleto) {
        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (boleto.getNumero(i) == combinacionGanadora[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    // Comprueba si el boleto tiene el complementario
    public boolean tieneComplementario(Boleto boleto) {
        for (int i = 0; i < 6; i++) {
            if (boleto.getNumero(i) == combinacionGanadora[6]) {
                return true;
            }
        }
        return false;
    }
}
