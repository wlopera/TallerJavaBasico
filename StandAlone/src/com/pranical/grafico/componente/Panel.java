package com.pranical.grafico.componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.pranical.grafico.negocio.ElementoGrafico;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	private ArrayList<ElementoGrafico> elementos;

	// Constructor 
	public Panel(ArrayList<ElementoGrafico> elementos) {
		this.elementos = elementos;
		this.setPreferredSize(new Dimension(400, 350)); // Variante de sobreescribir getPreferredSize() del JPanel
	}

	/*
	 * paintComponent: Pinta los elementos en el panel
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
    public void paintComponent(Graphics g) {
    	Graphics2D g2D = (Graphics2D) g;
    	for (ElementoGrafico elemento: elementos){
            Color colorActual = g2D.getColor();
    		elemento.dibujar(g2D);
            g2D.setColor(colorActual);
    	}
    }
    
    /**
     * getText: Consulta la informacion de cada elemento grafico y retorna sus resultados
     * @return Datos de elelmentos graficos
     */
    public String getText() {
    	StringBuffer sb = new StringBuffer();
    	for (ElementoGrafico elemento: elementos){
    		sb.append(elemento.getInformacionElemento()+ System.getProperty("line.separator"));
    	}
    	return sb.toString();
	}
}
