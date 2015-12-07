package org;

public class Search
{
	private static int index_compt=0;

	public static int sequentialSearch(int[] array, int value)
	{
		for(;index_compt<array.length;index_compt++)
		{
			if(array[index_compt]==value)
				return(index_compt); 
		}
		
		return(-1); 
	}
	
	public static int dichotomicSearch(int[] array, int value){
		  boolean find = false;  
		  int startIndex = 0;  
		  int endIndex = array.length;  
		  int pivot;  
		  
		  while(!find && ((endIndex - startIndex) > 1)){

		    pivot = (startIndex + endIndex)/2; 
		    
		    find = (array[pivot] == value);  
		    
		    if(array[pivot] > value) endIndex = pivot; 
		    else startIndex = pivot; 
		  }
		  
		  if(array[startIndex] == value) 
			  return(startIndex);  
		  else
			  return(-1);  
	}
}
