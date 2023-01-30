package com.politecnicomalaga.examenprogramacion;

import java.util.Scanner;

public class Ejercicio3
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner(System.in);



        System.out.println("Introduce un número entero: ");
        int numero = kb.nextInt();


        // Mostrar mediante un bucle los numeros posteriores empezando por el 1 hasta llegar al número introducido
        for (int i = 1; i <= numero; i++) 
        {
            System.out.println(i);
        } 

        // Mostrar mediante un bucle el número introducido y los números posteriores a él hasta llegar a 1
        for (int i = numero; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
}

