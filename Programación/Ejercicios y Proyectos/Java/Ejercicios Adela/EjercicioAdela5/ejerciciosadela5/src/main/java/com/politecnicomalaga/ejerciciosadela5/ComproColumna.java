package com.politecnicomalaga.ejerciciosadela5;

import java.util.Random;

public class ComproColumna {
    private int[][] matriz;
    private int[] columna;
    private int M;
    private int N;

    public ComproColumna() {
        Random random = new Random();
        M = random.nextInt(4) + 2;
        N = random.nextInt(4) + 2;
        matriz = new int[M][N];
        columna = new int[M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
            columna[i] = random.nextInt(100) + 1;
        }
    }

    public int comproColumna(int[][] mat, int[] col) {
        for (int j = 0; j < N; j++) {
            boolean igual = true;
            for (int i = 0; i < M; i++) {
                if (mat[i][j] != col[i]) {
                    igual = false;
                    break;
                }
            }
            if (igual) {
                return j;
            }
        }
        return -1;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int[] getColumna() {
        return columna;
    }

}