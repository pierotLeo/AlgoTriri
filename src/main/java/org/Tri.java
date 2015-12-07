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
	public static char[] convertIntToChar(int[] tabIntToSort)
	{
		char tabCharConverted[] = null;
		
		for(int i=0;i<tabIntToSort.length;i++)
			tabCharConverted[i]=(char)tabIntToSort[i];
				
		return tabCharConverted;
	}
	
	public static int[] tabNumSort(int[] tabNumToSort)
	{
		try
		{
			for(;tabCpt<tabNumToSort.length;tabCpt++)
			{
				if(tabCpt!=0 && (tabCpt<(tabNumToSort.length)))
				{	
					while(tabNumToSort[tabCpt-i]<tabNumToSort[tabCpt-tmp])
					{
						resNumTmp=tabNumToSort[tabCpt-tmp];
						tabNumToSort[tabCpt-tmp]=tabNumToSort[tabCpt-i];
						tabNumToSort[tabCpt-i]=resNumTmp;
						tmp++;
						i++;
					}
					
					i=0;
					tmp=1;
				}
			}
			
			System.out.println("Voici votre tableau trié dans l'ordre croissant :\n");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Une erreur est survenue au niveau des index du tableau...\n");
			e.printStackTrace();
			System.out.println("\nVoici votre tableau non-trié :\n");
		}
		
		return tabNumToSort; //returns the sent tab which has been sorted
	}
	
	public static char[] tabCharSort(char[] tabCharToSort)
	{
		try
		{
			for(;tabCpt<tabCharToSort.length;tabCpt++)
			{
				if(tabCpt!=0 && (tabCpt<(tabCharToSort.length)))
				{	
					while((int)(tabCharToSort[tabCpt-j])<(int)(tabCharToSort[tabCpt-tmp]))
					{
						resCharTmp=tabCharToSort[tabCpt-tmp];
						tabCharToSort[tabCpt-tmp]=tabCharToSort[tabCpt-j];
						tabCharToSort[tabCpt-j]=resCharTmp;
						System.out.println("tabcpt - j   : " + (tabCharToSort[tabCpt-j]));
						System.out.println("tabcpt - tmp : " + (tabCharToSort[tabCpt-tmp]));
						tmp++;
						j++;
						if((tabCpt - j) == 0)
							break;
					}
					System.out.println("je sui pa la");
					
					j=0;
					tmp=1;
				}
			}
			
			System.out.println("Voici votre tableau trié dans l'ordre croissant :\n");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Une erreur est survenue au niveau des index du tableau...\n");
			e.printStackTrace();
			System.out.println("\nVoici votre tableau non-trié :\n");
		}
		
		return tabCharToSort; //returns the sent tab which has been sorted
	}	

	public static char[] tabSpecialChar(char[] tabCharToSort)
	{
		try
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
			
			System.out.println("Voici votre tableau trié dans l'ordre croissant :\n");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Une erreur est survenue au niveau des index du tableau...\n");
			e.printStackTrace();
			System.out.println("\nVoici votre tableau non-trié :\n");
		}
		
		return tabCharToSort; //returns the sent tab which has been sorted
	}


}