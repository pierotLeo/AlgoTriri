package org;

import static org.junit.Assert.*;
import org.Arrays;

public class ArraysTest 
{
	public void searchTest()
	{
		int[] array={0,1,2,3,4};
		
		/**
		 * 
		 * unit tests
		 * 
		 */
		
		assertEquals(-1,Arrays.search(array,4)); //has to display false
		assertEquals(1,Arrays.search(array, 4)); //has to display false
		assertEquals(3,Arrays.search(array, 4)); //has to display true
		
		assertEquals(-1,Arrays.search(array,9)); //has to display true
		assertEquals(2,Arrays.search(array,9)); //has to display false
	}		
}
