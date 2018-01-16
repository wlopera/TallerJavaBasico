package com.pranical.herencia;

public class Run {
	private Vehiculo vehiculo;
	private Taxi taxi;
	
	public static void main(String[] args) {
		new Run().init();
	}
	
	public void init(){		
		vehiculo = new Vehiculo("Rojo", 123456789, "MAO-50J", 2);
		System.out.println("/++++++++++++++++ DATOS DEL VEHICULO +++++++++++++++++++/");
		vehiculo.getColor();
		vehiculo.getMotor();
		vehiculo.getPlaca();
		vehiculo.getPuertas();
		vehiculo.queSoy();
		
		System.out.println();
		System.out.println("/++++++++++++++++ DATOS DEL TAXI +++++++++++++++++++/");
		taxi = new Taxi("Azul", 135798642, "INT-60H", 4, 850000.00);
		taxi.getColor();
		taxi.getMotor();
		taxi.getPlaca();
		taxi.getPuertas();
		taxi.getCosto();
		taxi.queSoy();
		System.out.println();
		
		vehiculo = (Vehiculo)taxi;
		System.out.println("/++++++++++++++++ DATOS DEL TAXI CAST COMO VEHICULO +++++++++++++++++++/");
		vehiculo.getColor();
		vehiculo.getMotor();
		vehiculo.getPlaca();
		vehiculo.getPuertas();
		vehiculo.queSoy();
		//vehiculo.getCosto(); => error
		
		
	}

}
