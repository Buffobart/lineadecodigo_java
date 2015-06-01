package com.lineadecodigo.java.basico;

/**
 * @file TablasDeMultiplicar.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   5-junio-2007
 * @url    http://lineadecodigo.com/2007/06/05/tablas-de-multiplicar-en-java/
 * @description Creaci�n de un programa que bajo petici�n de un n�mero calcule su tabla de multiplicar.  
 */

import java.io.*;

public class TablasDeMultiplicar {


	public static void main(String[] args) {
		
		   InputStreamReader isr = new InputStreamReader(System.in);
		   BufferedReader br = new BufferedReader(isr);


		   // Variables para el manejo del n�mero
		   String sNumero = ""; 
		   Integer iNumero = null;
		   int iNumeroCalculo;
		   
		   // Pedimos por consola el n�mero del cual queremos
		   // la tabla de multiplicar
		   
		   System.out.println("Introduce el n�mero de la tabla de multiplicar");
		   
		   try {
		   
		     // Leemos del buffer 
		     sNumero = br.readLine(); 
		     // Convertimos la cadena a un n�mero Integer
		     iNumero = new Integer(sNumero);

		     System.out.println("El n�mero introducido es " + sNumero);
		     iNumeroCalculo = iNumero.intValue();
		   
		     // Mostramos la tabla de multiplicar
		     for (int x=1;x<11;x++) 
		       System.out.println(iNumeroCalculo + " x " + x + " = " + 
		             (x*iNumeroCalculo));
		   
		   } catch (IOException ioe){
		     System.out.println("No se pudo leer de consola");
		   }catch (NumberFormatException nfe){
		     System.out.println("El valor introducido no es v�lido"); 
		   }
	}

}
