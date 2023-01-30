package com.politecnicomalaga.buclescondicionales;

import java.util.Scanner;

public class condicionesconbucles {

    public condicionesconbucles(){

    }
    public static void main( String[] args )
    {
       boolean continuar = true;
       String options;
       Scanner tecladoMenu = new Scanner(System.in);
       condicionesconbucles program = new condicionesconbucles();


       while (continuar) {

        System.out.println("");
        System.out.println("Selecciona el ejercicio a ejecutar");
        System.out.println("1. Par-Impar 1");
        System.out.println("2. Par-Impar 2");
        System.out.println("3. Par-Impar 3");
        System.out.println("4. Par-Impar 4");
        System.out.println("5. Sumatorio");
        System.out.println("6. Rango de múltiplos");
        System.out.println("Cualquier otro valor: Salir");

        options = tecladoMenu.nextLine();



        switch (options) {
            case "1": program.ejercicio1();
            break;
            case "2": program.ejercicio2();
            break;
            case "3": program.ejercicio3();
            break;
            case "4": program.ejercicio4();
            break;
            case "5": program.ejercicio5();
            break;
            case "6": program.ejercicio6();
            break;
            default: continuar = false;
            
        }
       }
    }


    public void ejercicio1 (){
        Scanner teclado = new Scanner(System.in);
        int par, impar;

        System.out.println("Introduce un número par:");
        par = teclado.nextInt();
        teclado.reset();
        System.out.println("Introduce un número impar:");
        impar = teclado.nextInt();

        if (Math.abs(par % 2) != 0 || Math.abs(impar % 2) != 1){
            System.out.println("Hay uno o más valores escritos que no son correctos");
            System.out.println("Vuelve a iniciar la opción 1 para intentarlo de nuevo.");
        } else{
            System.out.println("Valores correctos.");
        }
        }

    public void ejercicio2 (){

        Scanner teclado = new Scanner(System.in);
        int par, impar;

        System.out.println("Introduzca un número par:");
        par = teclado.nextInt();

        if (Math.abs(par % 2) != 0){
            System.out.println("El número introducido no es par");
            System.out.println("Vuelva a ejecutar el segundo ejercicio para intentarlo de nuevo");
        }else{
            teclado.reset();
            System.out.println("Introduzca un número impar");
            impar = teclado.nextInt();

            if (Math.abs(impar % 2) != 1){
                System.out.println("El número introducido no es impar");
                System.out.println("Vuelva a ejecutar el segundo ejercicio para intentarlo de nuevo");

            } else {
                System.out.println("Los valores introducidos son correctos.");
            }
        }

        
        }
    
    public void ejercicio3 (){
        Scanner teclado = new Scanner (System.in);
        int par, impar;
        boolean errorpar = false;
        boolean errorimpar = false;

        System.out.println("Introzca un número par");
        par = teclado.nextInt();
        teclado.reset();
        System.out.println("Introduzca un número impar");
        impar = teclado.nextInt();


        if (Math.abs(impar % 2) !=1){
            errorimpar = true;
            System.out.println("El valor introducido es invalido:" + String.valueOf(impar));
        }

        if (errorpar || errorimpar){
            System.out.println("Vuelve a iniciar el ejercicio 3 para volver a intentarlo");

        } else{
            System.out.println("Los datos introducidos son válidos.");
        }

    
    }
    
    public void ejercicio4(){
        Scanner teclado = new Scanner (System.in);
        int par, impar;
        boolean error = false;

        System.out.println("Introduzca un valor par");
        par = teclado.nextInt();
        
        if (Math.abs(par % 2) != 0){
            System.out.println("El valor introducido no es par:" + String.valueOf(par));
        }

        teclado.reset();
        System.out.println("Introduzca un valor impar");
        impar = teclado.nextInt();

        if(Math.abs(impar % 2) != 1){
            System.out.println("El valor introducido no es impar: " + String.valueOf(impar));
        }

        if(error) {
            System.out.println("Vuelva a iniciar el ejercicio 4 para volverlo a intentar");
        
        }else {
            System.out.println("Los datos introducidos son correctos");
        }

    }

    public void ejercicio5 (){
        Scanner teclado = new Scanner (System.in);
        
        int total = 0;
        int numero;

        System.out.println("Introduzca un número");
        numero = teclado.nextInt();

        for (int i = 1;i<=numero;i++){
            total += i;
        }

        System.out.println("Salida: ");
        System.out.println("El número es: " + String.valueOf(numero));
        System.out.println("El valor total es: " + String.valueOf(total));
    }


    public void ejercicio6 (){
        Scanner teclado = new Scanner(System.in);
        int minimo, maximo, m;

        System.out.println("Introduza el número M");
        m = teclado.nextInt();
        teclado.reset();

        System.out.println("Introduzca el número minimo");
        minimo = teclado.nextInt();
        teclado.reset();

        System.out.println("Introduzca el número máximo");
        maximo = teclado.nextInt();

        for (int i = minimo;i<=maximo;i++){
            if (i%m == 0) {
                System.out.println(String.valueOf(i) + "");
            }
        }

        System.out.println("Valores introducidos son correctos");






    }

    }



    

