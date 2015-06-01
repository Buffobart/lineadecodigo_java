package com.lineadecodigo.java.util.collections;

/**
 * @file MaximoMinimoConjunto.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   24-jun-2006
 * @url    http://lineadecodigo.com/2007/06/26/maximo-y-minimo-numero-de-un-conjunto/
 * @description Calculo del n�mero m�nimo y m�ximo de un conjunto mediante el framework Collections
 */

import java.util.*;

public class MaximoMinimoConjunto {

	public static void main(String[] args) {

	    Set<Integer> hs = new HashSet<Integer>();
	    hs.add(2);
	    hs.add(4);
	    hs.add(6);
	    hs.add(8);

	    System.out.println("El n�mero mayor del conjunto es... "
	     + Collections.max(hs));
	    System.out.println("El n�mero menor del conjunto es... "
	     + Collections.min(hs));
		
		
	}

}
