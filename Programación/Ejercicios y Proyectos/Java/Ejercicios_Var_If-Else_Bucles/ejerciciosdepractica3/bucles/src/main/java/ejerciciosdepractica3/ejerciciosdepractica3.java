package ejerciciosdepractica3;

import java.util.Scanner;

public class ejerciciosdepractica3 
{
    public void ejerciciosdepractica3(){

    }
    public static void main( String[] args )
    {
       Scanner teclado = new Scanner (System.in);
       boolean salir = false;
       int opcion;
       ejerciciosdepractica3 programa = new ejerciciosdepractica3();

       while(!salir){

        System.out.println("#############################################");
        System.out.println("1. Bucle For.");
        System.out.println("2. Bucle While.");
        System.out.println("3. Bucle Do/While.");
        System.out.println("4. Bucle For - Cuenta Atrás.");
        System.out.println("5. Bucle While - Cuentra Atrás.");
        System.out.println("6. Bucle Do/While - Cuentra Atrás.");
        System.out.println("7. Caja Fuerte.");
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

            case 6: programa.ejercicio6();
            break;

            case 7: programa.ejercicio7();
            break;

            default:
            salir = true;}}}
    
    public void ejercicio1(){

    /*Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
    bucle for. */

    Scanner teclado = new Scanner (System.in);
    int numero;
    int multiplos;
    

    System.out.println("Introduzca un número del cual se mostrará sus primeros 10 múltiplos");
    numero = teclado.nextInt();

    for(int i = 0;i<10;i++){
        multiplos = numero * i;
        System.out.println("El " + (i) + "º múltiplo del número introducido es: " + multiplos);}
    }

public void ejercicio2(){
   
   /*Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
    bucle while. */
    
    
    Scanner teclado = new Scanner (System.in);
    int numero;
    int multiplos;
    int i = 0;

    System.out.println("Introduzca un número del cual se mostrará sus primeros 10 mútliplos");
    numero = teclado.nextInt();

    while(i <10){

        multiplos = numero * i;
        System.out.println("El " + (i) + "º múltiplo del número introducido es: " + multiplos);

        i++;

    }
}

public void ejercicio3(){

    /*Muestra los primeros 10 múltiplos de un número entero recogido desde el teclado, mediante un
    bucle do-while. */

    Scanner teclado = new Scanner (System.in);
    int numero;
    int multiplos;
    int i = 0;

    System.out.println("Introduzca un número del cual se mostrará sus primeros 10 mútliplos");
    numero = teclado.nextInt();

    do{

        multiplos = numero * i;
        System.out.println("El " + (i) + "º múltiplo del número introducido es: " + multiplos);

        i++;
        
    }   while(i < 10);
}



public void ejercicio4(){

    /*Muestra una cuenta atrás desde 20 a 1 por pantalla, usando un bucle for.*/

    Scanner teclado = new Scanner (System.in);
    

    for(int i = 20;i > 0;i--){
        
    System.out.println(i);}
}

public void ejercicio5(){
    /*Muestra una cuenta atrás desde 20 a 1 por pantalla, usando un bucle while. */
    
    Scanner teclado = new Scanner (System.in);
    int i = 20;
    while(i > 0){

        System.out.println(i);

        i--;
    }

}

public void ejercicio6(){

    /*Muestra una cuenta atrás desde 20 a 1 por pantalla, usando un bucle do-while.*/

    Scanner teclado = new Scanner (System.in);
    int i = 20;


    do{

        System.out.println(i);

        i--;


    }while(i > 0);
}

public void ejercicio7(){
    /*Realiza el control de acceso a una caja fuerte. Las contraseñas serán combinaciones de 4 caracteres
    alfanuméricos. La contraseña inicial será “0000”. Se debe de mostrar un menú cómo el que se
    muestra a continuación:

    1. Asignar nueva combinación
    2. Abrir caja fuerte
    0. Salir

    Se debe de ejecutar el menú mientras no se pulse un 0. Si nos pulsan 1, pedimos la combinación
    anterior y si se acierta, se solicita una nueva que pasará a ser la activa. Si no se acierta se mostrará
    “combinación errónea”. En el caso de acertar: “Introduzca nueva combinación” y después
    pondremos “Nueva combinación almacenada” cuando nos den la nueva. En el caso de la opción 2,
    pedimos la combinación activa y si se acierta se muestra en pantalla “Caja fuerte abierta”. */

    Scanner teclado = new Scanner (System.in);
    
    int seleccion; // Selecciona dentro del menú por teclado
    String contraseña = "0000"; // Contraseña por defecto de la caja fuerte
    String contraseñaintroducida; // Contraseña nueva introducida por teclado

    do{
        System.out.println("##################################################");
        System.out.println("");
        System.out.println("1. Asignar nueva contraseña");
        System.out.println("2. Abrir Caja Fuerte");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("Selecciona una opción por favor.");
        seleccion = teclado.nextInt();
        System.out.println("##################################################");

        //Caso 1 - Asignar nueva contrasñea
        if(seleccion == 1){
            
            System.out.println("Por métodos de seguridad, por favor, introduzca la contraseña actual");
            contraseñaintroducida = teclado.next();

            
            // Si la contraseña es correcta
            if(contraseñaintroducida.equals(contraseña)){
                
                System.out.println("Contraseña correcta, introduzca una nueva contraseña;");
                do{
                    contraseñaintroducida = teclado.next();
                    if(contraseñaintroducida.length()!= 4){

                        System.out.println("La nueva contraseña debe tener 4 cáracteres.");
                        System.out.println("Introduzca una nueva contraseña ");
                    }
               
                }while(contraseñaintroducida.length()!= 4 || contraseñaintroducida.equals(contraseña));

                    contraseña = contraseñaintroducida; // Guardar la contraseña introducida como la nueva contraseña predeterminada.
                    System.out.println("Contraseña cambiada con éxito.");}

            // Si la contraseña es incorrecta
            else{
                System.out.println("Contraseña errónea");

                if(contraseñaintroducida.length()< 4){
                    System.out.println("La contraseña introducida tiene menos de 4 carácteres");}

                else if (contraseñaintroducida.length()> 4){
                    System.out.println("La combinación tiene más de 4 carácteres.");
                }
            }
       }
        
       // Caso 2 
       else if(seleccion == 2){
                
        System.out.println("Introduzca la contraseña: ");
        contraseñaintroducida = teclado.next();
        
        //Si la contraseña es correcta
        
            if(contraseñaintroducida.equals(contraseña)){ 
                System.out.println("Caja fuerte abierta");}
        
        //Si la contraseña es incorrecta
        
                else{
                 System.out.println("Combinación errónea");}}
    //Caso 0
        else if(seleccion != 0){
        System.out.println("Esa opción no es correcta");}
    
        }while(seleccion != 0);
        System.out.println("Cerrando programa. ¡Gracias por su uso!");
}
}






