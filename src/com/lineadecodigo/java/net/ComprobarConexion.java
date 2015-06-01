package com.lineadecodigo.java.net;

/**
 * @file ComprobarConexion.java
 * @version 1.0
 * @author  Christian G. Gimenez(http://lineadecodigo.com)
 * @date   27-junio-2012
 * @url    http://lineadecodigo.com/java/comprobar-conexion-a-internet-con-java/
 * @description C�digo que comprueba si hay una conexi�n.  
 */

import java.net.Socket;

public class ComprobarConexion {

public static void main(String[] args) {

	String dirWeb = "www.lineadecodigo.com";
	int puerto = 80;

		try{
			Socket s = new Socket(dirWeb, puerto);
			if(s.isConnected()){
			System.out.println("Conexi�n establecida con la direcci�n: " + dirWeb + " a trav�z del puerto: " + puerto);
			}
	}catch(Exception e){
		System.err.println("No se pudo establecer conexi�n con: " + dirWeb + " a travez del puerto: " + puerto);
	}
}
}
