package com.politecnicomalga.ejerciciosadela2;


public class Piloto {
    // Atributos
    private String nombre;
    private int[] puntos = new int[3];

    // Constructor
    public Piloto(String nombre) { // Recibe el nombre del piloto
        this.nombre = nombre;
    }
    
    // Métodos

    // Asigna un punto a la prueba indicada
    public void asignarPunto(int prueba, int punto) {
        this.puntos[prueba] = punto;
    }
    // Devuelve la suma de los puntos de todas las pruebas
    public int obtenerPuntosTotales() {
        int suma = 0;
        for (int punto : puntos) {
            suma += punto;
        }
        return suma;
    }
    // Devuelve el nombre del piloto
    public String obtenerNombre() {
        return this.nombre;
    }
}