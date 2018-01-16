package com.pranical.herencia;

public class Vehiculo {
	public String color;
	public Integer motor;
	public String placa;
	public int puertas;
	
	public Vehiculo() {}
	
	public Vehiculo(String color, Integer motor, String placa, int puertas) {
		this.color = color;
		this.motor = motor;
		this.placa = placa;
		this.puertas = puertas;
	}
	
	public void getColor(){
		System.out.println("El color del vehiculo: "+ color);
	}

	public void getMotor(){
		System.out.println("El motor del vehiculo: "+ motor);
	}

	public void getPlaca(){
		System.out.println("La placa del vehiculo: "+ placa);
	}

	public void getPuertas(){
		System.out.println("Cantidad de puertas del vehiculo: "+ puertas);
	}

	public void queSoy(){
		System.out.println("SOY UN VEHICULO");
	}
}
