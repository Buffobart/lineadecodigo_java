package com.lineadecodigo.java.basico;

/**
 * @file EsUnDigito.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   30/diciembre/2006
 * @url  http://lineadecodigo.com/java/�es-ese-caracter-un-numero/
 * @description Valida si una cadena introducida por pantalla es un n�mero
 */

public class EsUnDigito {

	public static void main(String[] args) {
		
		
		if (Character.isDigit('3'))
		    System.out.println("El caracter es un d�gito");
		else
		    System.out.println("El caracter NO es un d�gito");
		

	}

}
