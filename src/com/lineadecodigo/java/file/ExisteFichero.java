package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file ExisteFichero.java
 * @version 1.0
 * @author V�ctor Cuervo. (http://lineadecodigo.com)
 * @date   03/junio/2015
 * @url    http://lineadecodigo.com/java/saber-si-existe-un-fichero-con-java/
 * @description C�digo para saber si existe fichero.
 */


public class ExisteFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String sFichero = "fichero.txt";
		   File fichero = new File(sFichero);

		   if (fichero.exists())
		     System.out.println("El fichero " + sFichero + " existe");
		   else
		     System.out.println("Pues va a ser que no");

	}

}
