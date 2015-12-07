package org;

public class Arrays
{
	private static int index_compt=0;

	public static int search(int[] array, int value)
	{
		for(;index_compt<array.length;index_compt++)
		{
			if(array[index_compt]==value)
				return(index_compt); //value trouvée
		}
		
		return(-1); //value non trouvée
	}
}