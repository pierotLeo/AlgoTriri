package org;

public class ArraysTri {
	public static int[] tri(int[] array){
		int i, j, cle;
		
		for (i = 1; i < array.length; i++) {
			cle = array[i];
			j = i;
			
			while ((j >= 1) && (array[j - 1] > cle)) {
				array[j]  = array[j - 1] ;
				j = j - 1;
			}
			array[j] = cle;		
	
		}
		return array;
	}
	
	
}
