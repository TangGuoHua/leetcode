package com.leetcode.s152;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMaxProduct() {
		
		
		assertEquals(12, new com.leetcode.s152.Solution().maxProduct(new int[] {-4,-3,-2}));
		assertEquals(6, new com.leetcode.s152.Solution().maxProduct(new int[] {2,3,-2,4}));
		assertEquals(3, new com.leetcode.s152.Solution().maxProduct(new int[] {3,-1,-1}));
		assertEquals(6, new com.leetcode.s152.Solution().maxProduct(new int[] {2,3,-2,4}));
		assertEquals(0, new com.leetcode.s152.Solution().maxProduct(new int[] {-2,0,-1}));
		
	}

}
