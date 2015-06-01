package com.lineadecodigo.java.basico;

/**
 * @file NumerosPrimos.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  01-enero-2009
 * @url    http://lineadecodigo.com/2006/11/26/numeros-primos-en-java/
 * @description Listar los n�meros primos.
 */

public class NumerosPrimos {

	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		return primo;
	}	
	
	public static void main(String[] args) {

		int iNumero = 11;
		if (esPrimo(iNumero))
			System.out.println("Es numero primo");
		else
			System.out.println("NO es numero primo");		
		
		
		for (int x=2;x<10000;x++) {
			if (esPrimo(x))
				System.out.print(x + " ");				
		}		
		
	}

}
