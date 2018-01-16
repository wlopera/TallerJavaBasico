package com.pranical.clase;

public class SaldoInicialMetodoInstancia3 {

    public static void main(String[] args){
    	// Llamo al parametro estatico del objeto Cuenta
    	System.out.println("Saldo inicial: "+ CuentaBancaria.saldo);
    	System.out.println("Tipo De Cuenta: "+ CuentaBancaria.getTipoCienta());
    }
}

class CuentaBancaria{
	public static double saldo = 10000.00;
    public String tipoCuenta = "AHORRO";
    
    public static String getTipoCienta(){
    	return new CuentaBancaria().tipoCuenta;
    }
}