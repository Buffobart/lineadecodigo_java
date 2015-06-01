package com.lineadecodigo.java.swing;

/**
 * @file ResolucionPantalla.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   13.sept.2010
 * @url  http://lineadecodigo.com/java/conocer-la-resolucion-de-la-pantalla-con-java/  
 * @description Clase que nos permite conocer la resoluci�n de la pantalla del usuario
 */

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucionPantalla {

	public static void main(String[] args) {		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("Tu resoluci�n es de " + screenSize.width + "x" + screenSize.height);		
	}

}
