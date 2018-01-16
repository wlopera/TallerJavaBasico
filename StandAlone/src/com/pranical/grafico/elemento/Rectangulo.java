package com.pranical.grafico.elemento;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import com.pranical.grafico.negocio.DefaultElementoGrafico;

public class Rectangulo extends DefaultElementoGrafico{
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	public void dibujar(Graphics2D g2D) {
		Rectangle2D rect = new Rectangle2D.Double(0, 0, ancho, alto);
        g2D.setColor(getColor());
        g2D.fill(rect);
    }
	
	@Override
	public String getInformacionElemento() {
		return "Rectangulo de ancho: "+ancho+" y alto: "+ alto;		
	}
}
