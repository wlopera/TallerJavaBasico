package com.pranical.grafico.elemento;

import java.awt.Graphics2D;
import com.pranical.grafico.negocio.DefaultElementoGrafico;

public class Texto extends DefaultElementoGrafico{
	private String txt;
	private int x;
	private int y;
	
	public Texto(String txt, int x, int y) {
		this.txt = txt;
		this.x = x;
		this.y = y;
	}

    public void dibujar(Graphics2D g2D) {
    	g2D.setColor(getColor());
    	g2D.drawString(txt, x, y);
    }
    
	@Override
	public String getInformacionElemento() {
		return txt + " en la posición: ("+x+","+y+")";	
	}
}