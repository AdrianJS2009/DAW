package com.ejerciciosdepractica2;

import java.util.Scanner;
public class ejerciciosdepractica2  
{
    public ejerciciosdepractica2(){

    }
    
    public static void main( String[] args )
    {
       Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion;
       ejerciciosdepractica2 programa = new ejerciciosdepractica2();

       while(!salir){

        System.out.println("#############################################");
        System.out.println("1. If/Else 1.");
        System.out.println("2. If/Else 2.");
        System.out.println("3. If/Else 3.");
        System.out.println("4. If/Else 4.");
        System.out.println("5. If/Else 5.");
        System.out.println("Salir");
        System.out.println("");
        System.out.println("Selecciona un ejercicio a ejecutar");
        System.out.println("#############################################");
        opcion = teclado.nextInt();
        

        switch(opcion){
            case 1: programa.ejercicio1();
            break;

            case 2: programa.ejercicio2();
            break;

            case 3: programa.ejercicio3();
            break;

            case 4: programa.ejercicio4();
            break;

            case 5: programa.ejercicio5();
            break;

            default:
            salir = true;}
}   
}


    public void ejercicio1(){
    
    /*Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes
    o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
    respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.*/
        
    Scanner teclado = new Scanner (System.in);
    int hora;

        System.out.println("Introduce la hora sin los minutos por favor.");
        hora = teclado.nextInt();

            if(hora>=6&&hora<=12){
                System.out.println("¡Buenos días!");}

                else if(hora>=13&&hora<=20){
                    System.out.println("¡Buenas tardes!");}

                    else{
                        System.out.println("¡Buenas noches!");}
}



public void ejercicio2(){

    /*Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de
    la semana. */

    Scanner teclado = new Scanner (System.in);
    int dia;
    
    System.out.println("Escribe un número del 1 al 7 para mostrar el día equivalente de la semana.");
    dia = teclado.nextInt();

    if(dia == 1){
        System.out.println("Es lunes.");}

        else if(dia == 2){
            System.out.println("Es martes.");}

            else if(dia == 3){
                System.out.println("Es miercoles.");}

                else if(dia == 4){
                    System.out.println("Es jueves.");}

                    else if(dia == 5){
                        System.out.println("Es viernes.");}

                        else if (dia == 6){
                            System.out.println("Es sábado");}

                            else if (dia == 7){
                                System.out.println("Es domingo.");}

                                else {
                                    System.out.println("Valor inválido");}
}


public void ejercicio3(){
    
    /*Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
    horas ordinarias (40 primeras horas de trabajo) se pagan a 15 euros la hora. A partir de la hora 41, se
    pagan a 20 euros la hora. Lee el número de horas trabajadas una semana por un trabajador y calcula
    su retribución. */
    
    Scanner teclado = new Scanner (System.in);
    int horasExtra;
    int horas;
    int salario;

    System.out.println("¿Cúantas horas has trabajado esta semana?");
    horas = teclado.nextInt();


    if(horas <=41){
        salario = horas*20;
        System.out.println("Tu retribución es: " + salario + " EUROS");}


       else{
        salario = horas * 15;
        horasExtra = horas - 40;
        int salarioExtra = horasExtra*5;
        salario = salario + salarioExtra;
        System.out.println("Tu retribución es: " + salario + " EUROS");}
       
    }


public void ejercicio4(){

    /*Realiza un programa que calcule la media de tres notas obtenidas del teclado, muestre la cantidad
    numérica obtenida y después añada: Insuficiente, suficiente, bien, notable o sobresaliente. Las notas
    son:
    Nota menor que 5: insuficiente
    Nota entre 5 y 6 (sin incluir al 6): suficiente
    Nota entre 6 y 7 (sin incluir al 7): bien
    Nota entre 7 y 8.5 (sin incluir al 8.5): notable
    Nota mayor o igual a 8.5: sobresaliente */

    Scanner teclado = new Scanner (System.in);
    int nota1, nota2, nota3;
    

    System.out.println("Introduzca el válor de la primera nota.");
    nota1 = teclado.nextInt();

    System.out.println("Introduzca el valor de la segunda nota.");
    nota2 = teclado.nextInt();

    System.out.println("Introduzca el valor de la tercera nota.");
    nota3 = teclado.nextInt();

    int suma = nota1 + nota2 + nota3;
    int media = suma / 3;

    if(media < 0){
        System.out.println("Tienes un 0. ¡Suspenso!");}

        if (media < 5){
            System.out.println("Tienes menos que un 5, es fuerzate más. ¡Insuficiente!");}

            else if (media < 6){
                System.out.println("Puedes mejorar más, pero tienes un ¡Suficiente!");}

                else if (media < 7){
                    System.out.println("Bien hecho, tienes un ¡Bien!");}

                    else if (media < 8.5){
                        System.out.println("Buen trabajo, tienes un ¡Notable!");}

                        else if (media > 8.5){
                            System.out.println("Enhorabuena, tienes un ¡Sobresaliente!");}

                            else{
                                System.out.println("Valor no válido.");}

}



public void ejercicio5(){

    /*Escribe un programa que ordene tres números enteros introducidos por teclado */
    Scanner teclado = new Scanner(System.in);
    int grande;
    int mediano;
    int pequeño;

    
    System.out.println("Introduzca el primer número: ");
    int pnum = teclado.nextInt();
    
    System.out.println("Introduzca el segundo número: ");
    int snum = teclado.nextInt();
    
    System.out.println("Introduzca el tercer número: ");
    int tnum = teclado.nextInt();
    
    if (pnum >= snum){
        if(pnum >= tnum){
            grande = pnum;
            if(snum >= tnum){
                mediano = snum;
                pequeño = tnum;
            }
            else{ //tnum > snum
                mediano = tnum;
                pequeño = snum;
            }
        }
        else{ //tnum > pnum
            grande = tnum;
            mediano = pnum;
            pequeño = snum;
        }
    }else{ //snum > pnum
        if(pnum >= tnum){
            grande = snum;
            mediano = pnum;
            pequeño = tnum;
        }
        else{ //tnum > pnum
            if(snum >= tnum){
                grande = snum;
                mediano = tnum;
                pequeño = pnum;
            }
            else{ //tnum > snum
                grande = tnum;
                mediano = snum;
                pequeño = pnum;
            }
        }
    }
    System.out.println(grande + " > " + mediano + " > " + pequeño);
}
}



