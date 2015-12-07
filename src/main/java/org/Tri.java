package org;

public class Tri {
	
	public static String[] convertIntToChar(int[] tabIntToSort)
	{
		String tabCharConverted[] = new String[tabIntToSort.length];
		
		for(int i=0;i<tabIntToSort.length;i++)
			tabCharConverted[i]=Integer.toString(tabIntToSort[i]);
				
		return tabCharConverted;
	}
	
	public static int[] tabNumSort(int[] tabNumToSort)
	{
		boolean tab_en_ordre = false;
		int taille = tabNumToSort.length;
		while(!tab_en_ordre)
		{
			tab_en_ordre = true;
			for(int i=0 ; i < taille-1 ; i++)
			{
				if(tabNumToSort[i] > tabNumToSort[i+1])
				{
					int tmp = tabNumToSort[i];
					tabNumToSort[i] = tabNumToSort[i+1];
					tabNumToSort[i+1] = tmp;
					tab_en_ordre = false;
				}
			}
			taille--;
		}
		
		return tabNumToSort;
		 
	}
	
	public static char[] tabCharSort(char[] tabCharToSort)
	{
		boolean tab_en_ordre = false;
		int taille = tabCharToSort.length;
		while(!tab_en_ordre)
		{
			tab_en_ordre = true;
			for(int i=0 ; i < taille-1 ; i++)
			{
				if(tabCharToSort[i] > tabCharToSort[i+1])
				{
					char tmp = tabCharToSort[i];
					tabCharToSort[i] = tabCharToSort[i+1];
					tabCharToSort[i+1] = tmp;
					tab_en_ordre = false;
				}
			}
			taille--;
		}
		
		return tabCharToSort;
	}	

	public static char[] tabSpecialChar(char[] tabCharToSort)
	{
			
		boolean tab_en_ordre = false;
		int taille = tabCharToSort.length;
		while(!tab_en_ordre)
		{
			tab_en_ordre = true;
			for(int i=0 ; i < taille-1 ; i++)
			{
				if(tabCharToSort[i] > tabCharToSort[i+1])
				{
					char tmp = tabCharToSort[i];
					tabCharToSort[i] = tabCharToSort[i+1];
					tabCharToSort[i+1] = tmp;
					tab_en_ordre = false;
				}
			}
			taille--;
		}
		
		return tabCharToSort;
	}


}
