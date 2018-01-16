package com.pranical.herencia;

public class Taxi extends Vehiculo {
	public Double costo;

	public Taxi(String color, Integer motor, String placa, int puertas, Double costo) {
		super(color, motor, placa, puertas);
		this.costo = costo;
	}
	
	@Override // Sobreescibir el metodo
	public void getColor(){
		System.out.println("El color del Taxi: "+ color);
	}

	@Override
	public void getMotor(){
		System.out.println("El motor del Taxi: "+ motor);
	}

	@Override
	public void getPlaca(){
		System.out.println("La placa del Taxi: "+ placa);
	}

	@Override
	public void getPuertas(){
		System.out.println("Cantidad de puertas del Taxi: "+ puertas);
	}

	public void getCosto(){
		System.out.println("El costo del Taxi: "+ costo);
	}
}
