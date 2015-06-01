/**
 * @file ReverseRecursivo.java
 * @version 1.0
 * @author V�ctor Cuervo (http://lineadecodigo.com)
 * @date  04/mayo/2015
 * @url    http://lineadecodigo.com/java/xxx/
 * @description Realizar el reverse de una cadena de texto de forma recursiva.
 */


public class ReverseRecursivo {
	
	
	public String reverse(String palabra) {
		
		if (palabra.length() == 1)
			return palabra;
		else 
			return reverse(palabra.substring(1)) + palabra.charAt(0);
		
	}
	
	public static void main(String... args){
		
		ReverseRecursivo rr = new ReverseRecursivo();
		
		String sPalabra="avi�n";
		System.out.println(rr.reverse(sPalabra));
		
	}
	

}
