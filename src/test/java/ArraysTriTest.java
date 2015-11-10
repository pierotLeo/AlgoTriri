package org;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTriTest {

	@Test
	public void testTri() {
		int tabTestTri[] = {9,7,5,3,6,8,1,2,4};
		tabTestTri=ArraysTri.tri(tabTestTri);
		int result[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<tabTestTri.length;i++){
			assertEquals(result[i],(ArraysTri.tri(tabTestTri))[i]);
		}
		
	}

}
