package com.pranical.text;

import java.util.*;

public class TestWhile {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); // Acesso a la consola
        
        int numero;
        int calificacion=0;
        int sumaCalificaciones=0;
        double promedio = 0.0;
        
        // inicialización
        numero = 1;
        
        //ciclo while con condición de terminación
        while (numero <= 10) {
            System.out.printf ("Escriba la calificación %d:", numero);
            calificacion = entrada.nextInt();  // Espera por la entrada
            
            sumaCalificaciones = sumaCalificaciones + calificacion;
            
            //incremento
            numero++;
        }
        
        promedio = sumaCalificaciones / (numero * 1.0);
        
        System.out.printf ("El promedio es: %5.2f \n", promedio);
        
    }
}
