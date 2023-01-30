package com.politecnicomalaga.examenprogramacion;

import java.util.Scanner;

public class Ejercicio2 
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);
 

        int pos, vel, acel, tiempo;

        //Bucle para comprobar que la posición inicial es mayor o igual a 0
        do { 
            System.out.println("Introduce la posición inicial (número positivo mayor o igual a 0): ");
            pos = kb.nextInt();


            //Si la posición es menor que 0, se muestra un mensaje de error
            if (pos < 0 ) {
                System.out.println("El número introducido no es válido.");
            }
        } while (pos < 0); //Se repite el bucle mientras la posición sea menor que 0

        //Bucle para comprobar que la velocidad inicial es mayor o igual a 0 y menor o igual a 100
        do {
            System.out.println("Introduce la velocidad inicial (número positivo entre 0 y 100): ");
            vel = kb.nextInt();

            //Si la velocidad es menor que 0 o mayor que 100, se muestra un mensaje de error
            if (vel < 0 || vel > 100) { 
                System.out.println("El número introducido no es válido.");
            }
        } while (vel < 0 || vel > 100);
        //Se repite el bucle mientras la velocidad sea menor que 0 o mayor que 100


        //Bucle para comprobar que la aceleración inicial es mayor o igual a 5 y menor o igual a 15
        do {
            System.out.println("Introduce la aceleración inicial (entre 5 y 15): ");
            acel = kb.nextInt();

            //Si la aceleración es menor que 5 o mayor que 15, se muestra un mensaje de error
            if (acel < 5 || acel > 15) { 
                System.out.println("El número introducido no es válido.");
            }
        } while (acel < 5 || acel > 15);
        //Se repite el bucle mientras la aceleración sea menor que 5 o mayor que 15

        //Bucle para comprobar que el tiempo es mayor o igual a 10 y menor o igual a 100
        do { 
            System.out.println("Introduce el tiempo (entre 10 y 100): "); 
            tiempo = kb.nextInt();

            //Si el tiempo es menor que 10 o mayor que 100, se muestra un mensaje de error
            if (tiempo < 10 || tiempo > 100) { 
                System.out.println("El número introducido no es válido.");
            }
        } while (tiempo < 10 || tiempo > 100); 
        //Se repite el bucle mientras el tiempo sea menor que 10 o mayor que 100

        //Bucle para calcular la posición, velocidad y aceleración
        for (int i = 0; i < tiempo; i++) {
            pos = pos + vel;
            vel = vel + acel;
        }
        
        System.out.println("Velocidad: " + vel + " m/s"); 
        System.out.println("Aceleración: " + acel + " m/s2");
        System.out.println("Posición: " + pos + " m");
        System.out.println("Tiempo usado: " + tiempo + " segundos");
    }
}
