package com.pranical.grafico;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujo {
	private static JFrame frame;	// Ventana

    public static void main(String[] args) {
    	frame = new JFrame();
    	frame.setTitle("Test");
    	frame.add(new JPanelTest());    	
    	frame.pack();
    	frame.setVisible(true);
    }
 }

// Clase interna
@SuppressWarnings("serial")
class JPanelTest extends JPanel {

	// Tamaño del panel
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    @Override
    public void paintComponent(Graphics g) {
    	// Contexto grafico
    	 Graphics2D g2 = (Graphics2D) g;
    	 // Agregar Circulo
         Ellipse2D circle = new Ellipse2D.Double(getWidth() - 120, getHeight() - 120, 120, 120);
         g2.draw(circle);
         // Agregar linea
         Rectangle2D rect = new Rectangle2D.Double(0, 0, 100, 100);
         g2.draw(rect);
    }
}