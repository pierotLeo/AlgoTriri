package org;

public class Tri {
	
	private static int tabCpt=0;
	private static int tmp=1;
	private static int resNumTmp;
	private static char resCharIntTmp;
	private static char resCharTmp;
	private static int i=0; //for int
	private static int j=0; //for char
	private static int t=0; //for char from int
	
	public Tri(){}
	
	@SuppressWarnings("null")
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
		/*try
		{
			for(;tabCpt<tabCharToSort.length;tabCpt++)
			{
				if(tabCpt!=0 && (tabCpt<(tabCharToSort.length)))
				{	
					while((int)tabCharToSort[tabCpt-t]<(int)tabCharToSort[tabCpt-tmp])
					{
						resCharIntTmp=tabCharToSort[tabCpt-tmp];
						tabCharToSort[tabCpt-tmp]=tabCharToSort[tabCpt-t];
						tabCharToSort[tabCpt-t]=resCharIntTmp;
						tmp++;
						t++;
					}
					
					t=0;
					tmp=1;
				}
			}
			
			System.out.println("Voici votre tableau tri� dans l'ordre croissant :\n");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Une erreur est survenue au niveau des index du tableau...\n");
			e.printStackTrace();
			System.out.println("\nVoici votre tableau non-tri� :\n");
		}
		
		return tabCharToSort; //returns the sent tab which has been sorted*/
		
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