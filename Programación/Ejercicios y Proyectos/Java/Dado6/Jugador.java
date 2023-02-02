package com.politecnicomalaga.dados_ganael6_;

public class Jugador {
    private Dado dado1;
    private Dado dado2;
    private int puntos;

    public Jugador() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void jugar() {
        int tiro1 = dado1.lanzar();
        int tiro2 = dado2.lanzar();
        puntos = tiro1 + tiro2;
    }

    public int obtenerPuntos() {
        return puntos;
    }

    public int obtenerNumSeises() {
        int numSeises = 0;
        if (dado1.lanzar() == 6) {
            numSeises++;
        }
        if (dado2.lanzar() == 6) {
            numSeises++;
        }
        return numSeises;
    }
}