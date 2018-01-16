package com.pranical.text;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TestFrame extends JFrame 
{
  private Container contenedor;

    public TestFrame ()//constructor
    {
contenedor=getContentPane();
contenedor.setLayout(null);
		 
	//Asigna un titulo a la barra de titulo
	setTitle("Titulo de la Ventana");
	 
	//tamaño de la ventana
	setSize(400,200);
		 
	//pone la ventana en el Centro de la pantalla
	setLocationRelativeTo(null);
	setVisible(true);
    }
    
    public static void main(String[] args){
    	new TestFrame ();
    }
}

