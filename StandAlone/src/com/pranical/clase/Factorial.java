package com.pranical.clase;

import java.util.Scanner;

public class Factorial {
    private Scanner teclado;
    private int valor;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese valor a factorizar [0 <= valor <= 25]");
        valor=teclado.nextInt();
    }
    
    public long calcularFactorial() {
    	if (valor < 0 || valor > 25){
    		return -1;
    	} else {
	    		long resultado = 1;
	    	
	    	for(int i=1; i<valor; valor--)
	    	{
	    		resultado *= valor;
	    		System.out.println(valor + " -- " + resultado);
	    	}
	    	return resultado;
    	}
    }
    
    public void imprimir(long resultado) {
        System.out.println("Numero:"+valor + " su factorial es: "+ resultado);
    }
    
    public static void main(String[] ar) {
    	Factorial factorial =new Factorial();
        factorial.inicializar();
        long resultado = factorial.calcularFactorial();
        if (resultado > 0)
        	factorial.imprimir(resultado);
        else
        	System.out.println("No existe factorial de números negativos. Pruebe [0 <= valor <= 25]");
        	
    }
}