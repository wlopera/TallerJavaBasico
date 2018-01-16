package com.pranical.text;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestActionListener implements ActionListener{
	
    public static void main(String[] args){
    	new TestActionListener ();
    }
    
     public TestActionListener(){
    	JFrame frame = new JFrame("Uso ActionListener Java-Swing");    	
    	JButton b=new JButton("Aceptar");
     	b.addActionListener(this);
     	frame.add(b);
     	frame.setSize(400,100);
     	frame.setVisible(true);
    }
     public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Se presionó el botón Aceptar.");
     }
}
