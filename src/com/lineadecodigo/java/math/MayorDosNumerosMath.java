package com.lineadecodigo.java.math;

/**
 * @file MayosDosNumerosMath.java
 * @version 1.0
 * @author V�ctor Cuervo (http://lineadecodigo.com)
 * @date   16-octubre-2012
 * @url    http://lineadecodigo.com/java/mayor-de-dos-numeros-con-la-clase-math/
 * @description Calcular el m�ximo de dos n�meros mediante la clase Math de Java. 
 */


import java.util.Scanner;

public class MayorDosNumerosMath {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);                
        int iNumero1, iNumero2;
        
        System.out.println("Dame el primer n�mero");
        iNumero1 = reader.nextInt();
        
        System.out.println("Dame el segundo n�mero");
        iNumero2 = reader.nextInt();
        
        System.out.println("El mayor de los dos n�meros es " + Math.max(iNumero1, iNumero2));

	}

}
