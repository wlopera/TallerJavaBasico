package com.pranical.text;

import java.util.*;
public class TestIfElse {
    public static void main(String[] args) {
              @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in); // Acesso a la consola
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Circulo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();  // Espera por la entrada

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un circulo...");
        } else {
            System.out.println("Ha seleccionado terminar");
        }     
    }
}