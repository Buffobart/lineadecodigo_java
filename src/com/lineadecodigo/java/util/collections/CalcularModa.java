package com.lineadecodigo.java.util.collections;

/**
 * @file CalcularModa.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   09-noviembre-2010
 * @url     http://lineadecodigo.com/java/calcular-la-moda-de-una-distribucion-con-java/
 * @description Clase que calcula la moda de una distribuci�n utiliznado Java
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CalcularModa {
	
	public static void main(String[] args) {
	
		// Distribuci�n
		int[] elementos = {1,3,4,5,3,2,1,2,2,1,5,5,8,9,6,6,3,4,3,1,3,5,3};
		// Distribuci�n bipolar
		//int[] elementos = {1,3,4,5,3,2,1,2,2,1,8,9,6,6};
		// Distribuci�n sin moda
		// int[] elementos = {1,2,3,4,5,6,7,8,9};
		
		// Valor que hace que sea el m�s repetido
		int repeticiones = 0;
		// Lista de valores de la moda
		List<Integer> moda = new ArrayList<Integer>();
		
		
		// Mapas con los el n�mero de valores de la distribuci�n
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();				
		
		for (int elemento: elementos){			
			if (m.containsKey(elemento))					
				m.put(elemento,m.get(elemento)+1);
			else
				m.put(elemento,1);			
		}
				
		// Analizamos los pares clave/valor para ver quien tiene mayor n�mero de repeticiones
		Iterator<Entry<Integer, Integer>> iter = m.entrySet().iterator();		
	    while (iter.hasNext()) {	      
	    	Entry<Integer,Integer> e = iter.next();	    	
	    	if (e.getValue() > repeticiones) {
	    		moda.clear();
	    		moda.add(e.getKey());
	    		repeticiones = e.getValue();
	    	} else if (e.getValue() == repeticiones)
	    		moda.add(e.getKey());	    	
	    }
		
	    if (moda.size() == elementos.length)
	    	System.out.println("No hay moda");
	    else
	    	System.out.println("La moda de la distribuci�n es " + moda);

	}

}
