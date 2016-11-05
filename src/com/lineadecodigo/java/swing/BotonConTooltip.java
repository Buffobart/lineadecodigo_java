package com.lineadecodigo.java.swing;

/**
 * @file CerrarVenatana.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   27-agosto-2010
 * @url    http://lineadecodigo.com/java/anadir-un-tooltip-a-un-jbutton/
 * @description C�digo que nos permite a�adir un tooltip a un bot�n
 */

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BotonConTooltip extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public BotonConTooltip(){
		super("Botón con Tooltip");	
		
		getContentPane().setLayout(new FlowLayout());
				
		JButton boton = new JButton("Pasa sobre este botón");
		boton.setToolTipText("Tooltip del botón");
		getContentPane().add(boton);
			
		setSize(400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new BotonConTooltip();
	}

}
