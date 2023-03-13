package com.politecnicomalaga.tema10ejer1;

public class StringRepetido {

    private String texto;
    private int repeticiones;

    public StringRepetido(String texto, int repeticiones) {
        this.texto = texto;
        this.repeticiones = repeticiones;
    }

    public String getTexto() {
        return texto;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public String imprime() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            for (int j = 0; j < repeticiones; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
