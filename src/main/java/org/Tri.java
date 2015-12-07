package org;

public class Tri {
	
	public static String[] convertIntToString(int[] tabIntToSort)
	{
		String tabCharConverted[] = new String[tabIntToSort.length];
		
		for(int i=0;i<tabIntToSort.length;i++)
			tabCharConverted[i]=Integer.toString(tabIntToSort[i]);
				
		return tabCharConverted;
	}
	
	public static int[] tabNumSort(int[] tabNumToSort)
	{
		boolean sortedTab = false;
		int length = tabNumToSort.length;
		while(!sortedTab)
		{
			sortedTab = true;
			for(int i=0 ; i < length-1 ; i++)
			{
				if(tabNumToSort[i] > tabNumToSort[i+1])
				{
					int tmp = tabNumToSort[i];
					tabNumToSort[i] = tabNumToSort[i+1];
					tabNumToSort[i+1] = tmp;
					sortedTab = false;
				}
			}
			length--;
		}
		
		return tabNumToSort;
		 
	}
	
	public static char[] tabCharSort(char[] tabCharToSort)
	{
		boolean sortedTab = false;
		int length = tabCharToSort.length;
		while(!sortedTab)
		{
			sortedTab = true;
			for(int i=0 ; i < length-1 ; i++)
			{
				if(tabCharToSort[i] > tabCharToSort[i+1])
				{
					char tmp = tabCharToSort[i];
					tabCharToSort[i] = tabCharToSort[i+1];
					tabCharToSort[i+1] = tmp;
					sortedTab = false;
				}
			}
			length--;
		}
		
		return tabCharToSort;
	}	


}
