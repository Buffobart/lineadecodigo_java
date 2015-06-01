package com.lineadecodigo.java.basico;

/**
 * @file RestarNumerosTeclado.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   5-agosto-2010
 * @url    http://lineadecodigo.com/java/restar-dos-numeros-con-java/
 * @description Resta dos n�meros insertados por teclado 
 */

import java.util.Scanner;

public class RestarNumerosTeclado {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int resultado;
						
		Scanner reader = new Scanner(System.in);

		// Pedimos los n�meros por teclado
		System.out.println("Introduce el primer n�mero:");			
		numero1 = reader.nextInt();
			
		System.out.println("Introduce el segundo n�mero:");
		numero2 = reader.nextInt();
			
		// Multiplicamos
		resultado = numero1-numero2;
		
		System.out.println("La resta es " + numero1 + " - " + numero2 + " = " + resultado);
	}
}
