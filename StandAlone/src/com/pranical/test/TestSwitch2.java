package com.pranical.text;

import java.util.Scanner;

public class TestSwitch2 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        int opcionAlimento,
            opcionBebida;
        
        int cantidadAlimento,
            cantidadBebida;
        
        int totalAlimentos=0, 
            totalBebidas=0,
            totalPagar=0;
        
        System.out.println("Loncheria 'La Sabrosita'");
        System.out.println("------------------------");
        System.out.println("--|Menu de alimentos|--");
        System.out.println(" 1) Tortas.............. 400.00 Bs.");
        System.out.println(" 2) Dulces Salados...... 250.00 Bs.");
        System.out.println(" 3) Pan................. 250.00 Bs.");
        System.out.println(" 4) Chocolates.......... 400.00 Bs.");
        System.out.println("");
        System.out.println("--|Menu de bebidas|--");
        System.out.println(" 1) Refresco........  200.00 Bs.");
        System.out.println(" 2) Te o Limonada.... 200.00 Bs.");
        System.out.println(" 3) Jugo natural..... 250.00 Bs.");
        System.out.println(" 4) Cervezas......... 300.00 Bs.");

        	
        System.out.print ("Elija un alimento: ");
        opcionAlimento = entrada.nextInt();
        
        System.out.print ("   ¿Cual es la cantidad? ");
        cantidadAlimento = entrada.nextInt();
        
        System.out.print ("Elija una bebida: ");
        opcionBebida = entrada.nextInt();
        
        System.out.print ("   ¿Cual es la cantidad? ");
        cantidadBebida = entrada.nextInt();
        
        // analizar el tipo de alimento comprado
        switch (opcionAlimento) {
            case 1: 
            case 4:
                totalAlimentos = cantidadAlimento * 400;
                break;
                
            case 2:
            case 3:
                totalAlimentos = cantidadAlimento * 250;  
                break;
                
            default:
                totalAlimentos = 0;
        }
        
        // analizar el tipo de bebida comprada
        switch (opcionBebida) {
            case 1: 
            case 2:
                totalBebidas = cantidadBebida * 200;
                break;
                
            case 3:
                totalBebidas = cantidadBebida * 250; 
                break;
                
            case 4:
                totalBebidas = cantidadAlimento * 300;
                break;
                
            default:
                totalBebidas = 0;
        }
        
        // cálculo del total a pagar
        totalPagar = totalAlimentos + totalBebidas;
        
        
        System.out.printf ("Total alimentos: %d Bs. \n", totalAlimentos);
        System.out.printf ("Total bebidas  : %d Bs. \n", totalBebidas);
        System.out.printf ("Total a pagar  : %d Bs. \n", totalPagar);     
    }
}