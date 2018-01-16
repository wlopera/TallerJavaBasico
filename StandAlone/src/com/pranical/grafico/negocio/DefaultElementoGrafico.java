package com.pranical.grafico.negocio;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class DefaultElementoGrafico implements ElementoGrafico {
	private Color color;
	
	public abstract void dibujar(Graphics2D g2d) ;

	public abstract String getInformacionElemento() ;
	
	public Color getColor(){
		return color;
	}

	public void setColor(Color color){
		this.color = color;
	}
}
