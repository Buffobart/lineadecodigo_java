package com.lineadecodigo.java.basico;

/**
 * @file OperadorTernario.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   18/05/2010
 * @url  http://lineadecodigo.com/java/el-operador-ternario-en-java/
 * @description Calculo del mayor de dos n�meros mediante el operador ternario ?:
 */

public class OperadorTernario {
	
	public static void main(String[] args) {
	
		// Calcular el mayor de dos n�meros
		int x=10;
		int y=8;
		int mayor;
		
		
		// Con if-then-else
		if (x>y)
			mayor = x;
		else
			mayor = y;
		
		System.out.println("El mayor de dos n�meros es el " + mayor);
		
		// Con el operador ?
		mayor=(x>y)?x:y;	
		System.out.println("El mayor de dos n�meros es el " + mayor);

	}

}
