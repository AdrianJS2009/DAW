package com.politecnicomalaga.examenprogramacion3;

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main( String[] args )
    {
        boolean continuar = true;
        Scanner kb = new Scanner(System.in);
        String opcion, respuesta;
        
        int cerrados, seguimiento, mitigación;
        
        cerrados = 0;
        seguimiento = 0;
        mitigación = 0;
        
        //Creo la estructura de bucle para las opciones.
        while (continuar) {
            
            //Mostrar información para que el usuario sepa que pedir
            System.out.println("Sistema de clasificación de Tickets de detección temprana de Ciberdelincuencia");
            System.out.println("");
            System.out.println("#############################");
            System.out.println("");
            System.out.println("1. Introduzca 1 mediante teclado para realizar clasificación de tickets:");
            System.out.println("2. Introduzca 2 para mostras las estadísticas de los tickets procesados");
            System.out.println(" - Introduzca cualquier otra cosa para salir. - ");
            System.out.println("");
            System.out.println("############################");
               
            
            
            //Registrar nueva opción
            opcion = kb.nextLine();


            switch(opcion) {
                //Opcion para realizar clasificación de los tickets
                case "1":
                    System.out.println("¿Es una emergencia? [SI/NO, cualquier otro input se considerará NO]");
                    respuesta = kb.nextLine();
                    if (respuesta.equals("SI")){
                        System.out.println("Procedimiento de mitigación");
                        mitigación++;
                    } else { // En caso de no ser una emergencia
                        System.out.println("Ticket lanzado");
                        System.out.println("");
                        System.out.println("¿El ticket ha sido respondido? [SI/NO, cualquier otro input se considerará NO]");
                        respuesta = kb.nextLine();

                        if(respuesta.equals("SI")){
                            System.out.println("¿Se ha resuelto el ticket? [SI/NO, cualquier otro input se considerará NO]");
                            respuesta = kb.nextLine();

                            if(respuesta.equals("SI")){
                                System.out.println("El ticket se ha cerrado");
                                cerrados++;
                            } else { 
                                if (respuesta.equals("NO"))
                                System.out.println("Seguimiento de incidente");
                                seguimiento++;}

                        } else { // En caso de no haber sido respondido
                            System.out.println("¿Tiene el ticket una prioridad alta? [SI/NO, cualquier otro input se considerará NO]");
                            respuesta = kb.nextLine();

                            if(respuesta.equals("SI")){
                                System.out.println("Procedimiento de mitigación");
                                mitigación++;
                            } else { // En caso de no tener una prioridad alta
                                    System.out.println("Procedimiento de seguimiento");
                                    seguimiento++;

                            }


                        }
                        

                   
                    }


                    break;

                //Opcion para mostrar estadísticas
                case "2":
                    System.out.println("Estadísticas de tickets");
                    System.out.println("###########################################");
                    System.out.println("Tickets cerrados: " + cerrados);
                    System.out.println("Tickets en seguimiento: " + seguimiento);
                    System.out.println("Tickets en mitigación: " + mitigación);
                    System.out.println("###########################################");
                    break;

                //Opcion para salir
                default: continuar = false;
                   


              }
    
            }    

        }
    
    }


