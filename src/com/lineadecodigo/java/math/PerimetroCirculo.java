package com.lineadecodigo.java.math;

/**
 * @file PerimetroCirculo.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date 18-septiembre-2010
 * @url   http://lineadecodigo.com/java/calcular-el-perimetro-de-un-circulo-con-java/
 * @description Programa que calcula el per�metro de un c�rculo
 */

import java.util.Scanner;

public class PerimetroCirculo {

	public static void main(String[] args) {

		double perimetro,radio;
		
		System.out.println("Introduce el r�dio del c�rculo: ");
		Scanner reader = new Scanner(System.in);
		radio = reader.nextDouble();
		
		perimetro = 2*Math.PI*radio;
		
		System.out.println("Un c�rculo de r�dio " + radio + "tiene un per�metro de " + perimetro);
		
		reader.close();

	}

}
