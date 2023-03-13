package com.politecnicomalaga;

public class CodificarEspejo {

    private String texto;

    public CodificarEspejo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public String codifica() {
        String[] palabras = texto.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String palabra : palabras) {
            StringBuilder sbPalabra = new StringBuilder(palabra);
            sb.append(sbPalabra.reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
