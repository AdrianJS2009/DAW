package com.ejerciciosdepractica;

import java.util.Scanner;

public class ejerciciosdepractica 
{

    public ejerciciosdepractica(){

    }
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner (System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opción del usuario.
        ejerciciosdepractica program = new ejerciciosdepractica();

        while(!salir){ //Aqui a menos que pongamos salir = true, no nos saldremos del menu.

            System.out.println("######################################");
            System.out.println("");
            System.out.println("1. Variables 1.");
            System.out.println("2. Variables 2.");
            System.out.println("3. Variables 3.");
            System.out.println("4. Variables 4.");
            System.out.println("5. Variables 5.");
            System.out.println("6. Variables 6.");
            System.out.println("Salir.");
            System.out.println("");
            System.out.println("Selecciona un ejercicio a ejecutar.");
            System.out.println("#######################################");
            
            opcion = teclado.nextInt();

        switch(opcion){

            case 1: program.ejercicio1();
            break;
            
            case 2: program.ejercicio2();
            break;

            case 3: program.ejercicio3();
            break;

            case 4: program.ejercicio4();
            break;

            case 5: program.ejercicio5();
            break;

            case 6: program.ejercicio6();
            break;
            
            default:
            salir = true;

    }
    }
    }
   
   public void ejercicio1(){
   
    /*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 200 y
    111 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
    resta, la división y la multiplicación.*/

    int x, y, suma, resta, division, multiplicacion;
    x = 200;
    y = 111;
    suma = x + y;
    resta = x - y;
    division = x / y;
    multiplicacion = x * y;

    System.out.println("El valor de x es: " + (x));
    System.out.println("El valor de y es: " + (y));
    System.out.println("");
    System.out.println("La suma de ambos valores es: " + (suma));
    System.out.println("");
    System.out.println("La resta de ambos valores es: " + (resta));
    System.out.println("");
    System.out.println("La division de ambos valores es: " + (division));
    System.out.println("");
    System.out.println("La multiplicación de ambos valores es: " + (multiplicacion));

    

   }
   
   
public void ejercicio2(){


    /*Modifica el ejercicio anterior y lee del teclado dos enteros para asignarlos respectivamente a x e y.
    Prueba con varias ejecuciones la funcionalidad de esta minicalculadora. */
   
Scanner teclado = new Scanner (System.in);

int x, y, suma, resta, division, multiplicacion;

    System.out.println("Introduzca el valor de X: ");
    x = teclado.nextInt();
    System.out.println("Introduzca el valor de Y: ");
    y = teclado.nextInt();
    System.out.println("");

    suma = x + y;
    resta = x - y;
    division = x / y;
    multiplicacion = x * y;

    System.out.println("La suma de ambos valores es: " + (suma));
    System.out.println("");
    System.out.println("La resta de ambos valores es: " + (resta));
    System.out.println("");
    System.out.println("La division de ambos valores es: " + (division));
    System.out.println("");
    System.out.println("La multiplicación de ambos valores es: " + (multiplicacion));
    System.out.println("");

    teclado.close();

}

public void ejercicio3(){
/*Crea la variable nombre y asígnale tu nombre completo 
mediante un literal. Muestra su valor por pantalla. */

Scanner teclado = new Scanner (System.in);

String nombre = "Adrián Jiménez Santiago";

System.out.println("Mi nombre es: " + (nombre));

teclado.close();

}

public void ejercicio4(){

/*Crea las variables nombre, direccion y telefono y asígnales 
los valores correspondientes de manera literal. Muestra los valores de esas variables por pantalla. */    

String nombre, direccion, telefono;

nombre = "Adrián Jimenez Santiago";
direccion = "Calle Santa Ana 29570";
telefono = "62144598";

System.out.println("Mi nombre es: " + (nombre) );
System.out.println("");
System.out.println("Mi dirección es: " + (direccion));
System.out.println("");
System.out.println("Mi telefono es: " + (telefono));
System.out.println("");



}


public void ejercicio5(){

    /*Realiza una modificación al ejercicio 4 para que los datos de las variables se lean desde el teclado. */
    Scanner teclado = new Scanner (System.in);
    String nombre, direccion, telefono;

    System.out.println("¿Cúal es tú nombre?");
    nombre = teclado.next();
    System.out.println("");

    System.out.println("¿Cúal es tú dirección?");
    direccion = teclado.next();
    System.out.println("");

    System.out.println("¿Cúal es tú telefono?");
    telefono = teclado.next();
    System.out.println("");

    System.out.println("Tú nombre entonces es: "+ (nombre));
    System.out.println("Tú dirección entonces es: "+ (direccion));
    System.out.println("Tú Telefono entonces es: "+ (telefono));


}


public void ejercicio6(){

/*Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin
IVA). Todos los datos se leerán desde el teclado */

Scanner teclado = new Scanner (System.in);

float baseimponible;
float facturafinal;
float iva = 1.21f;


System.out.println("¿Cúal es tu base imponible?");
baseimponible = teclado.nextInt();
System.out.println("");


facturafinal = (baseimponible / iva);
System.out.println("La factura final sale a: " + (Math.round(facturafinal)));








}


}
