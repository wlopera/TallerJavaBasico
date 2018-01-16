package com.pranical.grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.pranical.grafico.componente.Panel;
import com.pranical.grafico.elemento.Circulo;
import com.pranical.grafico.elemento.Linea;
import com.pranical.grafico.elemento.Rectangulo;
import com.pranical.grafico.elemento.Texto;
import com.pranical.grafico.negocio.ElementoGrafico;

public class Vista implements ActionListener{
	private JFrame frame;
	private Panel panel;
	private JButton boton;
	private JTextArea textArea;
	
	public static void main(String[] args){
		new Vista().init();
	}
	
	public void init(){
		frame = new JFrame();
		frame.setSize(400,400);
		frame.setLayout(new BorderLayout());
		
		frame.setTitle("Elementos Gráficos");

        // Crear Rectangulo
        Rectangulo rectangulo = new Rectangulo(100, 100);
        rectangulo.setColor(Color.red);
        
        // Crear Circulo 
        Circulo circulo = new Circulo(50);
        circulo.setColor(Color.yellow);
        
        // Crear Linea
        Linea linea = new Linea(200, 200, 400, 350);
        linea.setColor(Color.green);
        
        // Crear Texto
        Texto texto = new Texto("TEXTO-ELEMENTO GRAFICO", 120, 20);
        texto.setColor(Color.magenta);
        
        ArrayList<ElementoGrafico> elementos = new ArrayList<ElementoGrafico>();
        elementos.add(rectangulo);
        elementos.add(circulo);
        elementos.add(linea);
        elementos.add(texto);
        
        panel = new Panel(elementos);
        textArea = new JTextArea(4,4);
        boton = new JButton("Información");
        boton.addActionListener(this);
        
        frame.add(panel, BorderLayout.NORTH);
        frame.add(boton,  BorderLayout.WEST);
        frame.add(textArea,  BorderLayout.CENTER);
        
        // Realizar ajuste de la vista al size definido
        frame.pack();
        
        // Mostrar la vista
        frame.setLocationRelativeTo(null); // Centrar la vista
        frame.setVisible(true);
        frame.repaint();    
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==boton) {
           textArea.setText(panel.getText());
           //JOptionPane.showMessageDialog(null, panel.getText());
        }
		
	}
}
