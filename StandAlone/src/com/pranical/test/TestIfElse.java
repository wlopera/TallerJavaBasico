package com.pranical.text;

import java.util.*;
public class TestIfElse {
    public static void main(String[] args) {
              @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in); // Acesso a la consola
        int opcion;

        System.out.println("Men� de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el �rea de un Cuadrado");
        System.out.println("2. Calcular el �rea de un Tri�ngulo");
        System.out.println("3. Calcular el �rea de un Circulo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opci�n: ");
        opcion = entrada.nextInt();  // Espera por la entrada

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el �rea de un cuadrado...");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el �rea de un tri�ngulo...");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el �rea de un circulo...");
        } else {
            System.out.println("Ha seleccionado terminar");
        }     
    }
}