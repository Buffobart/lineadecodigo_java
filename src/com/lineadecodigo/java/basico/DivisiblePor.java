package com.lineadecodigo.java.basico;

/**
 * @file DivisiblePor.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   28.julio.09
 * @url    http://lineadecodigo.com/java/numeros-divisibles-con-java/
 * @description Como calcular si un n�mero es divisible por otro.  
 */

import java.util.Scanner;

public class DivisiblePor {

	public static void main(String[] args) {
		
		// Pedimos los n�mero por teclado
		Scanner reader = new Scanner(System.in);
		int numero1,numero2;

		System.out.println("Introduce un n�mero");
		numero1 = reader.nextInt();
		
		System.out.println("Introduce el n�mero por el cual quieres saber si es divisible");
		numero2 = reader.nextInt();
		
		//Conprobamos si uno es divisible por otro
		if (numero1%numero2 == 0)
			System.out.println(numero1 + " es divisible por " + numero2);
		else
			System.out.println(numero1 + " NO es divisible por " + numero2);
		
		
	}

}
