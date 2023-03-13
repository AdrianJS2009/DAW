package com.politecnicomalaga;

import java.util.Scanner;

public class MainCRC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        CRC crc = new CRC(texto);
        String crcTexto = crc.getCRC();
        System.out.println("El código de redundancia cíclica es: " + crcTexto);
        
        System.out.print("Introduce un código de redundancia cíclica para comprobar: ");
        String crcComprobar = scanner.nextLine();
        int errores = crc.testCRC(crcComprobar);
        if (errores == -1) {
            System.out.println("El código de redundancia cíclica introducido no coincide en longitud con el generado.");
        } else {
            System.out.println("Número de errores en el código de redundancia cíclica: " + errores);
        }
    }
}
