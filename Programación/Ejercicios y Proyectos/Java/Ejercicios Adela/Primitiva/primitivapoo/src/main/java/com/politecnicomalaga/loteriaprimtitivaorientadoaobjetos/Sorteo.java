package com.politecnicomalaga.loteriaprimtitivaorientadoaobjetos;

import java.util.Random;

public class Sorteo {
    private int[] combinacionGanadora = new int[7];

    // Genera una combinación ganadora aleatoria de 6 números del 1 al 49 y un número complementario del 1 al 49 que no esté en la combinación ganadora.
    public void generarCombinacionGanadora() {
        Random aleatorio = new Random();
        int[] numeros = new int[49];

        // Rellenamos el array con los números del 1 al 49
        for (int i = 0; i < 49; i++) { 
            numeros[i] = i + 1; 
        }

        // Generamos los 6 números de la combinación ganadora y los guardamos en el array combinacionGanadora
        for (int i = 0; i < 6; i++) {
            int posicionAleatoria = aleatorio.nextInt(49 - i); // Generamos una posición aleatoria del array "numeros" que no haya sido elegida ya en la combinación ganadora. 
            combinacionGanadora[i] = numeros[posicionAleatoria]; // Guardamos el número de esa posición en la combinación ganadora
            numeros[posicionAleatoria] = numeros[48 - i]; // Intercambiamos el número de esa posición con el último número del array "numeros" que no haya sido elegido ya en la combinación ganadora.
        }
        combinacionGanadora[6] = aleatorio.nextInt(49) + 1; // Generamos el complementario y lo guardamos en la última posición del array combinacionGanadora. 
    }

    // Muestra por pantalla la combinación ganadora y el complementario de la primitiva.
    public void mostrarCombinacionGanadora() {
        for (int i = 0; i < 7; i++) { 
            System.out.print(combinacionGanadora[i] + " ");
        }
        System.out.println();
    }

    // Comprueba cuántos aciertos tiene el boleto con respecto a la combinación ganadora y devuelve el número de aciertos.
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
