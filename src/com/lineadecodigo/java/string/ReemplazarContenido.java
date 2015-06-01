package com.lineadecodigo.java.string;

/**
 * @file ReemplazarContenido.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31-mayo-2010
 * @url    http://lineadecodigo.com/java/reemplazar-contenido-con-java/
 * @description Reemplazar contenido de un texto  
 */

public class ReemplazarContenido {
	
	public static void main(String[] args) {

		String s = "La pausa la realiz� Fernando. En las representaciones de teatro, Fernando era el que mejor llevaba el tempo";
	    s = s.replaceAll("Fernando", "Pedro");
	    System.out.println(s);
		
	}

}
