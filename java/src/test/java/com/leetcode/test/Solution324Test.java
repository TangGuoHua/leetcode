package com.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Solution324Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindKthLargest() {
		assertEquals(5, new com.leetcode.s324.Solution().findKthNumber(new int[] {3,2,1,5,6,4}, 2-1));

		assertEquals(5, new com.leetcode.s324.Solution().findKthNumber(new int[] {5,2,4,1,3,6,0}, 2-1));

		assertEquals(1, new com.leetcode.s324.Solution().findKthNumber(new int[] {2,1}, 2-1));
				

		assertEquals(5, new com.leetcode.s324.Solution().findKthNumber(new int[] {3,2,1,5,6,4}, 2-1));
		assertEquals(4, new com.leetcode.s324.Solution().findKthNumber(new int[] {3,2,3,1,2,4,5,5,6}, 4-1));
//		
//
		assertEquals(1, new com.leetcode.s324.Solution().findKthNumber(new int[] {1},1-1));
//		

		
	}
//	@Test
//	public void testFindIndex() {
//		
//		assertEquals(1, new com.leetcode.s324.Solution().findIndex(new int[] {1,2,2,2,2,3}, 2, 0, 5));
//		assertEquals(1, new com.leetcode.s324.Solution().findIndex(new int[] {2,2,2,2,2,3}, 2, 0, 5));
//		
//		assertEquals(0, new com.leetcode.s324.Solution().findIndex(new int[] {2,2,2,3,3}, 3, 0, 4));
//	}

}
