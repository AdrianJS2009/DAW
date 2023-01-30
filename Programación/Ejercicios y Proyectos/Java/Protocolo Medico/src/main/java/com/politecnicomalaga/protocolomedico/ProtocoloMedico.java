package com.politecnicomalaga.protocolomedico;

import java.util.Scanner;

public class ProtocoloMedico
{
    public ProtocoloMedico(){

    }
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        String continua;
        

        while (continuar){
            
            System.out.println("Ecografía transtorácica");
            System.out.println("¿Complicado? (Septos) [SI/NO]");
            continua = teclado.nextLine();

            if("SI".equals(continua)){
                System.out.println("Drenaje pleural \n + fibrinolíticos \n + antibioterapia");
                continua = teclado.nextLine();

                System.out.println("¿Mala evolución en 48-75 h?[SI/NO]")
                 else if("SI".equals(continua)){
                    System.out.println("Ecografia");
                    System.out.println("Persistencia de derrame y septos?[SI/NO]");
                    continua = teclado.nextLine();

                     if ("SI".equals(continua)){
                        System.out.println("Videotorascopia");
                    }
                 }

            }





        }

    }
}
