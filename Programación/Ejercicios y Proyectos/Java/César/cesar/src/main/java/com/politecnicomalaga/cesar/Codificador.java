package com.politecnicomalaga.cesar;

class Codificador {
    private String textoOriginal;

    public Codificador(String textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public String codificaDecodifica(int llave) {
        StringBuilder sb = new StringBuilder();
        for (char c : textoOriginal.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char) (((c - 'A' + llave) % 26) + 'A'));
                } else {
                    sb.append((char) (((c - 'a' + llave) % 26) + 'a'));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}