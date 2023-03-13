package com.politecnicomalaga.tema10ejer2;

import java.util.Scanner;

public class MainMezclaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer texto:");
        String s1 = scanner.nextLine();
        
        System.out.println("Introduce el segundo texto:");
        String s2 = scanner.nextLine();
        
        MezclaStrings mezclaStrings = new MezclaStrings(s1, s2);
        
        System.out.println("Texto 1: " + mezclaStrings.getSInformacion1());
        System.out.println("Texto 2: " + mezclaStrings.getSInformacion2());
        
        String mezcla = mezclaStrings.mezcla();
        System.out.println("Texto mezclado: " + mezcla);
        
        mezclaStrings.separa(mezcla);
        System.out.println("Texto 1 después de separar: " + mezclaStrings.getSInformacion1());
        System.out.println("Texto 2 después de separar: " + mezclaStrings.getSInformacion2());
    }
}
