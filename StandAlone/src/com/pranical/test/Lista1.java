package com.pranical.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lista1 {
	private static ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Lista1 lista = new Lista1();
		System.out.println("/++++++++++++++ Lista original +++++++++++++++/");
		lista.llenarlista();
		lista.imprimirLista();
		System.out.println("\n/++++++++++++++ Lista Orden Ascendente+++++++++++++++/");
		lista.ordernarLista();
		System.out.println("\n/++++++++++++++ Lista Orden Descendente +++++++++++++++/");
		lista.ordernarListaReversa();
	}

	public void llenarlista(){
		arrayListInt.add(3); 	
		arrayListInt.add(4);
		arrayListInt.add(2);	
		arrayListInt.add(6);
		arrayListInt.add(5);	
		arrayListInt.add(1);
		arrayListInt.add(7);	
	}
	
	public void ordernarLista(){
		Collections.sort(arrayListInt);
		imprimirLista();
	}
	
	private void ordernarListaReversa(){
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(arrayListInt, comparador);
		imprimirLista();
	}
	
	public void imprimirLista(){
		for(int i=0; i<arrayListInt.size(); i++){
			System.out.println("Posicion["+i+"]: "+ arrayListInt.get(i));
		}
	}
	
}
