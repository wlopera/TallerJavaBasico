package com.pranical.clase;

public class SaldoInicialMetodoInstancia1 {

    public double saldo = 10000.00;

    public static void getMetodo(){
    	SaldoInicialMetodoInstancia1 miSaldo = new SaldoInicialMetodoInstancia1();  // Creo una instancia
    	System.out.println("Saldo inicial: "+ miSaldo.saldo);			  		  // Llamo al parametro no estatico
    }
    
    public static void main(String[] args){
    	getMetodo();
    }
}