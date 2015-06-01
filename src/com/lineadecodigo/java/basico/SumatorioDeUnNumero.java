package com.lineadecodigo.java.basico;

/**
 * @file SumatorioDeUnNumero.java
 * @version 1.2
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   12-junio-2007
 * @url    http://lineadecodigo.com/2007/06/12/sumatorio-de-un-numero-en-java/
 * @description Utilizaci�n de un bucle para calcular el sumatorio de un n�mero en Java.  
 */



public class SumatorioDeUnNumero {

	public static void main(String[] args) {
	
		int iNumero = 5;
		int iSumatorio = 0;
		int iContador = iNumero;
		
		while (iContador != 0) {
		   
		  iSumatorio = iSumatorio + iContador;
		  iContador--;
		 
		}
		
		System.out.println("El sumatorio de " + iNumero + " es " + iSumatorio);

	}

}
