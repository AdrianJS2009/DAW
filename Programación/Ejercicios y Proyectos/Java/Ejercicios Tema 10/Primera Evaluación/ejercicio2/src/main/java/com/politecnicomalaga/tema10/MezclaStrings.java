package com.politecnicomalaga.ejertema10;

public class MezclaStrings {
    private String sInformacion1;
    private String sInformacion2;

    public MezclaStrings(String sInformacion1, String sInformacion2) {
        this.sInformacion1 = sInformacion1;
        this.sInformacion2 = sInformacion2;
    }

    public String getSInformacion1() {
        return sInformacion1;
    }

    public String getSInformacion2() {
        return sInformacion2;
    }

    public String mezcla() {
        int longitud1 = sInformacion1.length();
        int longitud2 = sInformacion2.length();
        StringBuilder resultado = new StringBuilder();

        int longitudMenor = Math.min(longitud1, longitud2);
        for (int i = 0; i < longitudMenor; i++) {
            resultado.append(sInformacion1.charAt(i));
            resultado.append(sInformacion2.charAt(i));
        }

        if (longitud1 > longitud2) {
            resultado.append(sInformacion1.substring(longitudMenor));
        } else if (longitud2 > longitud1) {
            resultado.append(sInformacion2.substring(longitudMenor));
        }

        resultado.append(".");
        resultado.append(longitudMenor);

        return resultado.toString();
    }

    public void separa(String textoMezclado) {
        int indicePunto = textoMezclado.indexOf(".");
        if (indicePunto == -1) {
            throw new IllegalArgumentException("El texto mezclado no es válido.");
        }

        String texto = textoMezclado.substring(0, indicePunto);
        int longitud = Integer.parseInt(textoMezclado.substring(indicePunto + 1));

        if (texto.length() != 2 * longitud) {
            throw new IllegalArgumentException("El texto mezclado no es válido.");
        }

        sInformacion1 = texto.substring(0, longitud);
        sInformacion2 = texto.substring(longitud);
    }
}
