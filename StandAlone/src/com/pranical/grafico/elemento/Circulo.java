package com.pranical.grafico.elemento;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import com.pranical.grafico.negocio.DefaultElementoGrafico;

public class Circulo extends DefaultElementoGrafico{
	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}

    public void dibujar(Graphics2D g2D) {
    	int diametro = 2 * radio;
    	Ellipse2D circle = new Ellipse2D.Double(100, 100, diametro, diametro);
        g2D.setColor(getColor());
        g2D.fill(circle);
    }

	@Override
	public String getInformacionElemento() {
		return "Circulo de radio:"+ radio;		
	}
}