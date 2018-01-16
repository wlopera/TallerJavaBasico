package com.pranical.clase;

public abstract class Mascota {
	private String nombre;
	
	public abstract void getSonido();
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}
