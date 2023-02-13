package com.politecnicomalga.ejerciciosadela2;


public class Piloto {
    // Atributos
    private String nombre;
    private int[] puntos = new int[3];

    // Constructor
    public Piloto(String nombre) { // Recibe el nombre del piloto
        this.nombre = nombre;
    }
    
    public void asignarPunto(int prueba, int punto) {
        this.puntos[prueba] = punto; // Asigna el punto a la prueba correspondiente
    }

    public int obtenerPuntosTotales() { // Devuelve la suma de los puntos de todas las pruebas
        int suma = 0;
        for (int punto : puntos) {
            suma += punto;
        }
        return suma;
    }

    public String obtenerNombre() { // Devuelve el nombre del piloto
        return this.nombre;
    }
}