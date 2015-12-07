package org;

import static org.junit.Assert.*;

import org.junit.Test;
import org.Arrays;

public class ArraysTest {

	@Test
	public void testSearch() {
		int tabTest[] = {0,1,2,3,4,5,6,7,8,9};
		int resultSuccess = 2;
		int resultFail = -1;
		//assertEquals(resultSuccess,Arrays.search(tabTest,2));
		assertEquals(resultFail, Arrays.search(tabTest, 10));
	}
	
}
