package com.politecnicomalaga.controlarrays;


public class Carrera {
    private final String codigo; // Código de la carrera (4 caracteres)
    private final int distancia; // Distancia en metros. Debe ser mayor que 0.
    private final int tiempo; // Tiempo en segundos. Debe ser mayor que 0.
    private final byte pendienteMedia; // Pendiente media de la carrera (0-10%). Debe ser mayor que 0 y igual o menor que 10.
    private final short dorsal; // Dorsal del corredor (100-999). Debe ser mayor que 100 y igual o menor que 999.
    
    public Carrera(String codigo, int distancia, int tiempo, byte pendienteMedia, short dorsal) {
        this.codigo = codigo;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.pendienteMedia = pendienteMedia;
        this.dorsal = dorsal;
    }
    // Getters
    public String getCodigo() {
        return codigo;
    }
    
    public int getDistancia() {
        return distancia;
    }
    
    public int getTiempo() {
        return tiempo;
    }
    
    public byte getPendienteMedia() {
        return pendienteMedia;
    }
    
    public short getDorsal() {
        return dorsal;
    }
    

    public String toString() {
        return codigo + " -> " + distancia + " metros, " + tiempo + " seg, " + pendienteMedia + "%, Dorsal: " + dorsal;
    }
}
