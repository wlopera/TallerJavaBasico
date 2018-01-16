package com.pranical.clase;

public class Cuenta{

    private double saldo;
    public void depositoInicial(double cantidad)
    
    {
    	saldo = cantidad;
    }

    public double getSaldo()
    {
    	return saldo;
    }
    
    public static void main(String[] args){
		Cuenta ahorro = new Cuenta();
		ahorro. depositoInicial(25000.00);
		Cuenta corriente = new Cuenta();
		// -> El saldo inicial de mi cuenta de ahorro es: 25.000,00
		System.out.println("El saldo inicial de mi cuenta de ahorro es: "+ ahorro.getSaldo()); 	
	    // -> El saldo inicial de mi cuenta corriente es: 0,00
		System.out.println("El saldo inicial de mi cuenta de corriente es: "+ corriente.getSaldo());
    }
}

