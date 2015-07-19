package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatricesIguales.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/comparar-matrices-en-java/
 * @description C�digo que compara que dos matrices sean iguales en n�mero de elementos y contenidos.
 */

import java.util.Arrays;

public class MatricesIguales {

	public static void main(String[] args) {
		
		int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		// Con equals no funciona ya que compara Object[].
		// Usamos el deepEquals
		if (Arrays.deepEquals(matriz1, matriz2))
			System.out.println("Son matrices iguales");
		else
			System.out.println("Son matrices diferentes");
		
		

	}

}
