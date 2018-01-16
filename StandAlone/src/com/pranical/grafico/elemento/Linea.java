package com.pranical.grafico.elemento;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import com.pranical.grafico.negocio.DefaultElementoGrafico;

public class Linea extends DefaultElementoGrafico {
	private int xStart;
	private int yStart;
	private int xEnd;
	private int yEnd;

    public Linea(int xStart, int yStart, int xEnd, int yEnd) {
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}

	public void dibujar(Graphics2D g2D) {
    	Line2D linea = new Line2D.Float(xStart, yStart, xEnd, yEnd);
	    g2D.setColor(getColor());
	    g2D.draw(linea);
    }
	
	@Override
	public String getInformacionElemento() {
		return "Línea de ("+xStart+","+ yStart+") a ("+xEnd+","+ yEnd+")";		
	}
}