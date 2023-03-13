package com.politecnicomalaga;

public class CRC {
    private String sInformacion;
    
    public CRC(String informacion) {
        sInformacion = informacion;
    }
    
    public String getCRC() {
        String crc = "";
        for (int i = 0; i < sInformacion.length(); i += 2) {
            int sum = sInformacion.charAt(i) + ((i + 1 < sInformacion.length()) ? sInformacion.charAt(i + 1) : 0);
            char c = (char) (sum / 2);
            crc += c;
        }
        return crc;
    }
    
    public int testCRC(String sCRC) {
        String crc = getCRC();
        if (crc.length() != sCRC.length()) {
            return -1;
        }
        int errors = 0;
        for (int i = 0; i < crc.length(); i++) {
            if (crc.charAt(i) != sCRC.charAt(i)) {
                errors++;
            }
        }
        return errors;
    }
}
