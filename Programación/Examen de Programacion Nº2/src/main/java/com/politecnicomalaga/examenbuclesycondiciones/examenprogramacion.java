package com.politecnicomalaga.examenbuclesycondiciones;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class examenprogramacion 
{
    public static int verde, amarillo, rojo, negro;{

    
    verde = 0;
    amarillo = 0;
    rojo = 0;
    negro = 0;}
    

    public examenprogramacion(){

    }
    public static void main( String[] args )
    {
      Scanner tecladomenu = new Scanner (System.in);
      boolean continuar = true;
      String opciones;
      examenprogramacion programa = new examenprogramacion();
      


    while (continuar){

        System.out.println("[######################################################]");
        System.out.println("Selecciona el proceso que quieras visualizar.");
        System.out.println("\n");
        System.out.println("1. Ejercicio 1 - Realizar triaje [Introduzca 1] ");
        System.out.println("2. - Mostrar estadisticas del triaje. - [Introduzca 2]");
        System.out.println("\n");
        System.out.println("3. Ejercicio 2 - Limite menor o mayor. [Introduzca 3]");
        System.out.println("Cualquier otro input para salir.");
        System.out.println("[######################################################]");

        opciones = tecladomenu.nextLine();

        switch (opciones) {
            case "1": programa.triaje();
            break;
            case "2": programa.estadisticas();
            break;
            case "3": programa.ejerciciolimites();
            break;
            default: continuar = false;   
            
        }
    }

}

public void triaje(){
      Scanner teclado = new Scanner (System.in);
      boolean continuar = true;
      String continua;
     

      System.out.println("## Comenzamos triage sobre el paciente ##");


      while(continuar){
      System.out.println("¿El paciente puede caminar? [SI/NO]");
      continua = teclado.nextLine();
      teclado.reset();


        if ("SI".equals(continua)){
            System.out.println("Prioridad 3 - VERDE");
            continuar = false; 
            verde ++;
            teclado.reset();

    
            }else if ("NO".equals(continua)){
                System.out.println("¿El paciente respira? [SI/NO]");
                continua = teclado.nextLine();
                teclado.reset();

        
                if ("NO".equals(continua)){
                    System.out.println("¿Al intentar reposicionar al paciente, este respira? [SI/NO]");
                    continua = teclado.nextLine();
                    teclado.reset();


                    if ("NO".equals(continua)){
                        System.out.println("Prioridad 0 - NEGRO");
                        continuar = false;
                        negro++;}
                        teclado.reset();


                        if ("SI".equals(continua)){
                            System.out.println("Prioridad 1 - ROJO");
                            rojo++;
                            continuar = false;}
                            teclado.reset();

                    
                }else if ("SI".equals(continua)){
                    System.out.println("¿Tiene la FR a mayor de 30? [SI/NO]");
                    continua = teclado.nextLine();
                    teclado.reset();


                    if ("SI".equals(continua)){
                        System.out.println("Prioridad 1 - ROJO");
                        continuar = false;
                        rojo++;
                        teclado.reset();}


                        if ("NO".equals(continua)){
                            System.out.println("¿Tiene pulso radial? [SI/NO]");
                            continua = teclado.nextLine();
                            teclado.reset();


                            if ("NO".equals(continua)){
                                System.out.println("Hay que controlarle la hemorragia al paciente");
                                System.out.println("Prioridad 1 - ROJO");
                                rojo++;
                                continuar = false;
                                teclado.reset();}


                                if ("SI".equals(continua)){
                                    System.out.println("¿El paciente se encuentra orientado? [SI/NO]");
                                    continua = teclado.nextLine();
                                    teclado.reset();


                                    if("SI".equals(continua)){
                                        System.out.println("Prioridad 2 - AMARILLO");
                                        amarillo++;
                                        continuar = false;
                                        teclado.reset();}


                                        if ("SI".equals(continua)){
                                            System.out.println("Prioridad 1 - ROJO");
                                            rojo++;
                                            continuar = false;
                                            teclado.reset();}
                                            }}}}}}

public  void estadisticas(){
    Scanner teclado = new Scanner (System.in);
    
    System.out.println("## Recuento de prioridades actual ##");
    System.out.println("-------------------------------------------");
    System.out.println("");
    System.out.println("Prioridad Verde - " + String.valueOf(verde));
    System.out.println("Prioridad Amarilla - " + String.valueOf(amarillo));
    System.out.println("Prioridad Roja - " + String.valueOf(rojo));
    System.out.println("Prioridad Negra - " + String.valueOf(negro));
    System.out.println("");

    
}

public void ejerciciolimites (){
    Scanner teclado = new Scanner(System.in);
    int inferior, superior, suma;



    System.out.println("Introduzca el número limite inferior");
    inferior = teclado.nextInt();
    teclado.reset();

    System.out.println("Introduzca el número limite superior");
    superior = teclado.nextInt();

    for (int i = inferior;i>=superior;i++){
        if (inferior >= superior ) {
            System.out.println("Vuelve a introducir los intervalos ya que el menor es mayor que el superior.");
            
            if (inferior <= superior){
                suma = (inferior) + (superior);     
                System.out.println("La suma es: " + (suma)); 
            
            
            break;
        } 

        
        }
    }








}

}


