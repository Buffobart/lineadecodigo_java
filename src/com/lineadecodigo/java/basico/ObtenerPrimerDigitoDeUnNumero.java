package com.lineadecodigo.java.basico;

import java.util.Scanner;

/**
 * @file ObtenerPrimerDigitoDeUnNumero.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  10-enero-2009
 * @url   http://lineadecodigo.com/2009/01/12/primer-digito-de-un-numero-con-java/
 * @description Solicitar un n�mero por consola y devolver el primer d�gito. 
 */

public class ObtenerPrimerDigitoDeUnNumero {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int iNumero, iTamanioNumero,iDesplazamiento;
		String sNumero;
		
		System.out.println("Introduce un n�mero por pantalla: ");
		sNumero = reader.next();
		iTamanioNumero = sNumero.length();
		iNumero = Integer.parseInt(sNumero);
		iDesplazamiento = Double.valueOf(Math.pow(10, iTamanioNumero-1)).intValue();
		
		
		System.out.println("El primer d�gito del n�mero " + iNumero + " es el " + iNumero/iDesplazamiento);
		System.out.println(iDesplazamiento);
		
	}

}
