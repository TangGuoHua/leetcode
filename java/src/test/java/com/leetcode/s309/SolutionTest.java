package com.leetcode.s309;

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
	public void testMaxProfit() {
		
		assertEquals(7, new com.leetcode.s309.Solution().maxProfit(new int[] {6,1,6,4,3,0,2}));

		assertEquals(3, new com.leetcode.s309.Solution().maxProfit(new int[] {1,2,3,0,2}));
	}

}
