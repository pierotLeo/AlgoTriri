package org;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure; 

public class TriTest 
{	
	
	@Test
	public void canConvertIntTabToCharTab()
	{
		int tabInt[]={1,2,1,3,5,4,2,6,7};
		String expected_tabConvertedInt[]={"1","2","1","3","5","4","2","6","7"};
		assertArrayEquals(expected_tabConvertedInt,Tri.convertIntToChar(tabInt));
	}
	
	@Test
	public void canSortATableOfNum() 
	{
		int tabInt[]={1,2,1,3,5,4,2,6,7};
		int expected_tabInt[]={1,1,2,2,3,4,5,6,7};
		assertArrayEquals(expected_tabInt,Tri.tabNumSort(tabInt));
	}
	
	@Test
	public void canSortATableOfChar() 
	{
		char tabChar[]={'a','r','t','z','s','c'};
		char expected_tabChar[]={'a','c','r','s','t','z'};
		assertArrayEquals(expected_tabChar,Tri.tabCharSort(tabChar));
	}
	
	@Test
	public void canSortSpecialChar()
	{
		char tabSpecialChar[]={'r','a','@','c','$','z','s','%','t','*'};
		char expected_tabChar[]={'$','%','*','@','a','c','r','s','t','z'};
		assertArrayEquals(expected_tabChar,Tri.tabSpecialChar(tabSpecialChar));
	}
	
	/*public static void main(String[] args)
	{	
		canConvertIntTabToCharTab();
		canSortATableOfNum();
		canSortATableOfChar();
		canSortSpecialChar();
	}*/
}
	
		/*int i=1;
			
		int newIntTabSorted[];
		char newCharTabSorted[];
		
		char newCharFromIntTab[];
		char newCharFromIntTabSorted[];*/

		
		/** .......................................................................................
		 * 
		 * we do sort a tab of int - brut
		 * 
		 **/
		
		/*System.out.println("Taille du tableau = "+tabInt.length+"\n");	
		
		newIntTabSorted=Tri.tabNumSort(tabInt);

		for(int val:newIntTabSorted)
		{
			System.out.println("Valeur n�"+i+" = "+val);
			i++;
		}	
		
		i=1;
		*/
		
		/** .......................................................................................
		 * 
		 * we do sort a tab of char - int converted to char and then sorted
		 * 
		 
		
		System.out.println("\nTaille du tableau = "+tabInt.length+"\n");	
		
		newCharFromIntTab=Tri.convertIntToChar(tabInt); //we convert our int tab into char tab
		newCharFromIntTabSorted=Tri.tabCharFromIntSort(newCharFromIntTab);
		
		for(char val:newCharFromIntTabSorted)
		{
			System.out.println("Valeur n�"+i+" = "+val);
			i++;
		}
		
		i=1;
		
		 .......................................................................................
		 * 
		 * we do sort a tab of char - brut
		 * 
		 *
		*/
		/*System.out.println("\nTaille du tableau = "+tabChar.length+"\n");	
		
		newCharTabSorted=Tri.tabCharSort(tabChar);

		for(char val:newCharTabSorted)
		{
			System.out.println("Valeur n�"+i+" = "+val);
			i++;
		}	*/
