package com.pranical.text;

import java.util.Scanner;

public class TestSwitch1 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        
        System.out.println("En cual rango esta tu edad: '");
        System.out.println("-----------------------------");
        System.out.println(" 0) 0 años");
        System.out.println(" 1) De 1 a 3 años");
        System.out.println(" 2) De 4 a 10 años");
        System.out.println(" 3) De 11 a 14 años");
        System.out.println(" 4) De 15 a 17 años");
        System.out.println(" 5) Tienes 18 años");
        System.out.println(" 6) De 19 a 30 años");
        System.out.println(" 7) De 31 a 50 años");
        System.out.println(" 8) De 51  a 65 años");
        System.out.println(" 9) De 66 a 80 años");
        System.out.println(" 10) De 81 a 120 años");
        System.out.println(" 11) > 120");
        System.out.print ("Elija un valor del rango: ");
        
        int edad = entrada.nextInt();
        
        switch (edad) {
            case 0:
                System.out.println ("Acaba de nacer hace poco. No ha cumplido el año");
                break;
            case 1: 
            	System.out.println ("Eres un bebe"); 
            	break;
            case 2: 
            	System.out.println ("Eres niño(a)"); 
            	break;
            case 3: 
            	System.out.println ("Eres adolecente"); 
            	break;
            case 4: 
            	System.out.println ("Eres un pavo(a)"); 
            	break;
            case 5: 
            	System.out.println ("Está justo en la mayoría de edad"); 
            	break;
            case 6: 
            	System.out.println ("Eres un joven"); 
            	break;                	
            case 7: 
            	System.out.println ("Eres una persona adulta"); 
            	break;                	
            case 8: 
            	System.out.println ("Debes ser una persona madura"); 
            	break;                	
            case 9: 
            	System.out.println ("Debes ser un abuelo consentidor"); 
            	break;
            case 10: 
            	System.out.println ("Hace rato estas jubilado"); 
            	break;
            case 11: 
            	System.out.println ("Estas escondiendo de San Pedro..."); 
            	break;
            default: 
            	System.out.println ("No es un valor valido o Estas en el recuerdo"); 
            	break;
        }     
    }
}
