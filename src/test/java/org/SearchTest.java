package org;


import static org.junit.Assert.*;

import org.junit.Test;
import org.Search;

public class SearchTest {

	@Test
	public void testSequentialSearch() {
		int tabTest[] = {0,1,2,3,4,5,6,7,8,9};
		int resultSuccess = 2;
		int resultFail = -1;
		assertEquals(resultSuccess,Search.sequentialSearch(tabTest,2));
		assertEquals(resultFail, Search.sequentialSearch(tabTest, 10));
	}
	
	@Test
	public void testDichotomicSearch(){
		int tabTest[] = {0,1,2,3,4,5,6,7,8,9};
		int resultSuccess = 2;
		int resultFail = -1;
		assertEquals(resultSuccess,Search.dichotomicSearch(tabTest,2));
		assertEquals(resultFail, Search.dichotomicSearch(tabTest, 10));
	}
	
}
