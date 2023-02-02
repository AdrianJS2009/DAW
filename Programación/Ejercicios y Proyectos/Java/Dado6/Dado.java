package com.politecnicomalaga.dados_ganael6_;

public class Dado {
    private int cara;
    private static final int NUM_CARAS = 6;

    public int lanzar() {
        cara = (int) (Math.random() * NUM_CARAS) + 1;
        return cara;
    }
}