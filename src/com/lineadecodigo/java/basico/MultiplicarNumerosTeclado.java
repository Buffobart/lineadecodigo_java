package com.lineadecodigo.java.basico;

/**
 * @file MultiplicarNumerosTeclado.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   28-diciembre-2008
 * @url    http://lineadecodigo.com/2007/12/30/multiplicar-dos-numeros-con-java/
 * @description Multiplica dos n�meros insertados por teclado 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MultiplicarNumerosTeclado {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int resultado;
		BufferedReader br;
				
		br = new BufferedReader(new InputStreamReader(System.in));
				
		try{ 
			// Pedimos los n�meros por teclado
			System.out.println("Introduce el primer n�mero:");			
			numero1 = Integer.parseInt(br.readLine());
			
			System.out.println("Introduce el segundo n�mero:");
			numero2 = Integer.parseInt(br.readLine());
			 
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
			
		// Multiplicamos
		resultado = numero1*numero2;
		
		System.out.println("La multiplicaci�n es " + numero1 + " x " + numero2 + " = " + resultado);
		
		
	}

}
