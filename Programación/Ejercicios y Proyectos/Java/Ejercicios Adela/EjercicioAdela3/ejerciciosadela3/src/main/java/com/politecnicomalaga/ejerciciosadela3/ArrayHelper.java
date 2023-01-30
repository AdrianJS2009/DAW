package com.politecnicomalaga.ejerciciosadela3;


public class ArrayHelper {
    public void movePrimeNumbersToStart(int[] array) {
        int posicionPrimos = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                int temp = array[i];
                array[i] = array[posicionPrimos];
                array[posicionPrimos] = temp;
                posicionPrimos++;
            }
        }
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}