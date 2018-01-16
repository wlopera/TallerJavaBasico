package com.pranical.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Lista2 {

	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		Lista2 lista = new Lista2();
		System.out.println("/++++++++++++++ Lista original +++++++++++++++/");
		lista.llenarlista();
		lista.imprimirLista();
		System.out.println("\n/++++++++++++++ Lista Orden Ascendente+++++++++++++++/");
		lista.ordernarLista();
		System.out.println("\n/++++++++++++++ Lista Orden Descendente +++++++++++++++/");
		lista.ordernarListaReversa();
	}

	public void llenarlista(){
		personas.add(new Persona("Pepe", 28));
		personas.add(new Persona("Juan", 32));
		personas.add(new Persona("Paco", 40));
		personas.add(new Persona("Susi", 24));
		personas.add(new Persona("Lola", 20));
		personas.add(new Persona("Jose", 28));
		personas.add(new Persona("Dani", 24));
		personas.add(new Persona("Sara", 36));	
	}
	
	// Este ArrayList lo queremos ordenar (de menor a mayor edad) en función de la edad de las personas, 
	// por tanto tenemos que sobre escribir el método “compare” de la clase Comparator y llamar al método “sort” 
	// de la clase collections
	// Odeno el arrayList de mayor a menor por edad y lo imprimo
	public void ordernarLista(){
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
			}
		});
		imprimirLista();
	}
	// Odeno el arrayList de menor a mayor por edad y lo imprimo
	public void ordernarListaReversa(){
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona p1, Persona p2) {
				// Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
				return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
			}
		});
		imprimirLista();
	}
	
	
	public void imprimirLista(){
		Iterator<Persona> itrArrayList = personas.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());
			posicion++;
		}
	}
}

class Persona {

	private String nombre;
	private int edad;

	public Persona() {
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return this.getNombre() + "  -  " + this.getEdad();
	}
}


