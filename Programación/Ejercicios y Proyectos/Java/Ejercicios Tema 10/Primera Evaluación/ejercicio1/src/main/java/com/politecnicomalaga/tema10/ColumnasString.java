package com.politecnicomalaga.ejertema10;



public class ColumnasString { // Clase que contiene el método que imprime la columna de caracteres
    private String originalString;
    private int repeticiones;

    // Constructor de la clase
    public ColumnasString(String originalString, int repeticiones) {
        this.originalString = originalString;
        this.repeticiones = repeticiones;
    }
    // Getters y Setters
    public String getOriginalString() {
        return originalString;
    }

    public int getrepeticiones() {
        return repeticiones;
    }
    // Método que imprime la columna de caracteres
    public String imprime() {
        StringBuilder resultado = new StringBuilder(); // StringBuilder para concatenar los caracteres
        for (int i = 0; i < originalString.length(); i++) { // Recorre la cadena original
            char c = originalString.charAt(i); // Guarda el caracter en la variable letra
            for (int j = 0; j < repeticiones; j++) { // Recorre el número de repeticiones
                resultado.append(c); 
            }
        }
        return resultado.toString();
    }
}
