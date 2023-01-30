package com.politecnicomalga.ejerciciosadela2;

import java.util.Random;
import java.util.Scanner;

public class Campeonato {
    private Piloto[] pilotos;

    public Campeonato() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        pilotos = new Piloto[6];

        // Carga los nombres de los pilotos
        for (int i = 0; i < pilotos.length; i++) {
            System.out.println("Introduce el nombre del piloto " + (i + 1) + ":");
            String nombre = sc.nextLine();
            pilotos[i] = new Piloto(nombre);
        }

        // Carga los puntos de los pilotos
        for (int i = 0; i < 3; i++) {
            System.out.println("Prueba " + (i + 1));
            int[] yaAsignados = new int[6];
            for (int j = 0; j < 3; j++) {
                int puntoAsignar = (j == 0) ? 10 : (j == 1) ? 8 : 6;
                int piloto;
                do {
                    piloto = r.nextInt(6);
                } while (yaAsignados[piloto] == 1);
                yaAsignados[piloto] = 1;
                pilotos[piloto].asignarPunto(i, puntoAsignar);
                System.out
                        .println("Asignados " + puntoAsignar + " puntos al piloto " + pilotos[piloto].obtenerNombre());
            }
        }
    }

    public void mostrarTop3() {
        // Muestra los pilotos que han conseguido las 3 primeras posiciones
        int[] top3 = { 0, 0, 0 };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (pilotos[i].obtenerPuntosTotales() > pilotos[top3[j]].obtenerPuntosTotales()) {
                    for (int k = 2; k > j; k--) {
                        top3[k] = top3[k - 1];
                    }
                    top3[j] = i;
                    break;
                }
            }
        }
        System.out.println("Los pilotos que han conseguido las 3 primeras posiciones son:");
        for (int i : top3) {
            System.out.println(pilotos[i].obtenerNombre());
        }
    }

    public void mostrarSinPuntos() {
        // Nombre de los pilotos que no han conseguido puntos en ninguna prueba.
        System.out.println("Los pilotos que no han conseguido puntos en ninguna prueba son:");
        for (Piloto piloto : pilotos) {
            if (piloto.obtenerPuntosTotales() == 0) {
                System.out.println(piloto.obtenerNombre());
            }
        }
    }

    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
        campeonato.mostrarTop3();
        campeonato.mostrarSinPuntos();
    }
}