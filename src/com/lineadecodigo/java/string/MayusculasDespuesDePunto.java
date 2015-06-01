package com.lineadecodigo.java.string;

/**
 * @file MayusculasDespuesDePunto.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date 24.septiembre.09
 * @url  http://lineadecodigo.com/java/poner-en-mayusculas-despues-de-punto/
 * @description Convertir a may�sculas todo car�cter que encontremos despu�s de un punto.  
 */



public class MayusculasDespuesDePunto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "hola juan.me ha gustado mucho.hag�monos p�blico.ma�ana hablamos.luis";		
		String frase2 = "";
		int indice = 0;
		int indicepunto = 0;
		
		
		indicepunto = frase.indexOf('.',indice);
		
		while (indicepunto >=0) {		
			// El primer car�cter es en may�sculas
			frase2 = frase2 + frase.substring(indice,indice+1).toUpperCase();
			// Pegamos el resto hasta el primer punto	
			frase2 = frase2 + frase.substring(indice+1,indicepunto+1);
		
			indice = indicepunto + 1;		
			indicepunto = frase.indexOf('.',indice);						
		}
		
		// Incluimos el final de la frase
		frase2 = frase2 + frase.substring(indice,indice+1).toUpperCase(); 
		frase2 = frase2 + frase.substring(indice+1,frase.length());

		
		System.out.println(frase2);
		
	}

}
