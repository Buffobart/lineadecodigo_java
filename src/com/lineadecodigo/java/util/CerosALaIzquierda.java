package com.lineadecodigo.java.util;
/**
 * @file CerosALaIzquierda.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date 27-octubre-2009   
 * @url  http://lineadecodigo.com/java/anadir-ceros-a-la-izquierda/
 * @description A�ade ceros a la izquierda de un n�mero hasta completar su tama�o.  
 */

import java.util.Formatter;

public class CerosALaIzquierda {

	public static void main(String[] args) {

		int numero = 425;
		int numero2 = 893;
		
		Formatter fmt = new Formatter();
		fmt.format("%08d",numero);
		System.out.println("El numero formateado " + fmt);
		
		fmt.format("Primer n�mero %1$08d - Segundo n�mero %2$08d ",numero,numero2);
		System.out.println(fmt);
		

	}

}
