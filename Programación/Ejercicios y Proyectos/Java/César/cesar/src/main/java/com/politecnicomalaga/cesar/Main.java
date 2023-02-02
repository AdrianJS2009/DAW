package com.politecnicomalaga.cesar;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el texto original: ");
    String textoOriginal = sc.nextLine();
    System.out.print("Ingrese la llave: ");
    int llave = sc.nextInt();
    Codificador codificador = new Codificador(textoOriginal);
    System.out.println("Texto codificado/decodificado: " + codificador.codificaDecodifica(llave));
  }
}