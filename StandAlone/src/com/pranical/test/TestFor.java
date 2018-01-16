package com.pranical.text;

import java.util.Scanner;

public class TestFor {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
        
        int numeroTabla;
        int numero;      
        
        System.out.print ("Cual tabla de multiplicar deseas? ");
        numeroTabla = entrada.nextInt();             
        
        System.out.println ("Tabla de Multiplicar");
                
        for (numero = 1; numero <= 10; numero+=1) {
            System.out.printf(" %d x %d = %d \n",
                   numeroTabla, numero, numeroTabla * numero);
        }   
    }
}