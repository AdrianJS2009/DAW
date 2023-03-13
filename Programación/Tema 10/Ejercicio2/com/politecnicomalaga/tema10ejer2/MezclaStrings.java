package com.politecnicomalaga.tema10ejer2;


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
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(sInformacion1.length(), sInformacion2.length());
        for (int i = 0; i < minLength; i++) {
            sb.append(sInformacion1.charAt(i));
            sb.append(sInformacion2.charAt(i));
        }
        sb.append(".");
        sb.append(minLength);
        return sb.toString();
    }

    public void separa(String mezcla) {
        int puntoPos = mezcla.length() - 2;
        int minLength = Integer.parseInt(mezcla.substring(puntoPos + 1));
        sInformacion1 = mezcla.substring(0, puntoPos - minLength * 2);
        sInformacion2 = mezcla.substring(puntoPos - minLength * 2, puntoPos);
    }
}
