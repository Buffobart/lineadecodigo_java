package com.lineadecodigo.java.swing;

/**
 * @file FormularioBasicoSwing.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   3-junio-2010
 * @url    http://lineadecodigo.com/java/formulario-basico-con-java-swing/
 * @description Crea un formilario b�sico (etiqueta, campo de texto y bot�n con Java Swing.
 */

import java.awt.FlowLayout;
import javax.swing.*;

public class FormularioBasicoSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	public FormularioBasicoSwing() {
		super("Formulario B�sico");	
		
		 getContentPane().setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Introduce tu nombre:");
		JTextField textfield = new JTextField("nombre",20);
		JButton boton = new JButton("Enviar");
		getContentPane().add(label);
		getContentPane().add(textfield);
		getContentPane().add(boton);
			
		setSize(400,300);
		setVisible(true);
	}
	
	public static void main(String argv[]) {
	    new FormularioBasicoSwing();
	  }

}
