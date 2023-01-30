/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.politecnicomalaga.examen29n;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Examen29n {

    public static void main(String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        String opcion, respuesta;
        
        int rojo, verde, amarillo, negro;
        
        rojo = 0;
        verde = 0;
        amarillo = 0;
        negro = 0;
        
        //Crear estructura de bucle para opciones
        while (continuar) {
            //mostrar información para que el usuario sepa que pedir
            System.out.println("Aplicación Urgencias");
            System.out.println("------------------------");
            System.out.println("Opciones:");
            System.out.println("1. Triaje");
            System.out.println("2. Estadísticas");
            System.out.println("Cualquier otra opción, salir.");
               
            
            
            //pedir nueva opción
            opcion = sc.nextLine();
            
            switch(opcion) {
                //opcion a triaje
                //tengo que ejecutar el triaje 
                case "1": //leer si puede caminar
                          System.out.println("¿El paciente puede caminar? (S(SI)/N (o cualquier otra letra, NO)");
                          respuesta = sc.nextLine();
                          if (respuesta.equals("S")) {
                            //si puede
                            System.out.println("Prioridad Verde");
                            verde++;
                          } else {
                            //no puede
                            System.out.println("¿El paciente respira? (S(SI)/N (o cualquier otra letra, NO)");
                            respuesta = sc.nextLine();
                            if (respuesta.equals("S")) {
                              //si puede
                              //Vamos a la FR
                                System.out.println("¿FR mayor a 30? (S(SI)/N (o cualquier otra letra, NO)");
                                respuesta = sc.nextLine();
                                if (respuesta.equals("S")) {
                                  //si es mayor
                                  System.out.println("Prioridad Roja");
                                  rojo++;
                                } else {
                                  //no es mayor. Pulso
                                    System.out.println("¿Pulso radial? (S(SI)/N (o cualquier otra letra, NO)");
                                    respuesta = sc.nextLine();
                                    if (respuesta.equals("S")) {
                                      //si tiene. Orientación pulso
                                        System.out.println("¿Está orientado? (S(SI)/N (o cualquier otra letra, NO)");
                                        respuesta = sc.nextLine();
                                        if (respuesta.equals("S")) {
                                          //si
                                          System.out.println("Prioridad Amarillo");
                                          amarillo++;

                                        } else {
                                          //no
                                          System.out.println("Prioridad Roja");
                                          rojo++;

                                        }
                                 
                                    } else {
                                      //no tiene
                                      System.out.println("Posible hemorragia. Controlar");
                                      System.out.println("Prioridad Roja");
                                      rojo++;

                                    }

                                }
                            } else {
                              //no puede. Reposición
                                System.out.println("¿Al reposicionar respira? (S(SI)/N (o cualquier otra letra, NO)");
                                respuesta = sc.nextLine();
                                if (respuesta.equals("S")) {
                                  //si
                                  System.out.println("Prioridad Roja");
                                  rojo++;

                                } else {
                                  //no
                                  System.out.println("Prioridad Negra");
                                  negro++;
                                }

                            }
                          }
                    
                break;

                //opcion b estadísticas
                case "2": //tengo que mostrar estadísticas
                      System.out.println("Estadísticas: ");
                      System.out.println("-----------------------------");
                      System.out.println("Verde: " + String.valueOf(verde));
                      System.out.println("Amarillo: " + String.valueOf(amarillo));
                      System.out.println("Rojo: " + String.valueOf(rojo));
                      System.out.println("Negro: " + String.valueOf(negro));
                      break;

                //salir
                default: continuar = false;
            }
        
        }
    }
}
