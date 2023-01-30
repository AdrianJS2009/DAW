package com.politecnicomalga.ejerciciosadela2;

public class Piloto {
    private String nombre;
    private int[] puntos = new int[3];

    public Piloto(String nombre) {
        this.nombre = nombre;
    }

    public void asignarPunto(int prueba, int punto) {
        this.puntos[prueba] = punto;
    }

    public int obtenerPuntosTotales() {
        int suma = 0;
        for (int punto : puntos) {
            suma += punto;
        }
        return suma;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}