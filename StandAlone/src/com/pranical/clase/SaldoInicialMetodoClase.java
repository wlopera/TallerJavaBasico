package com.pranical.clase;

public class SaldoInicialMetodoClase{

    public double saldo = 5000.00;

    public static void main(String[] args){
    	// Error no se puede llamar una referenica  no estatica desde un campo estatico
    	//System.out.println("Saldo inicial: "+ saldo);
    	SaldoInicialMetodoClase miSaldo = new SaldoInicialMetodoClase();  // Creo una instancia
    	System.out.println("Saldo inicial: "+ miSaldo.saldo);			  // Llamo al parametro no estatico
    }
}