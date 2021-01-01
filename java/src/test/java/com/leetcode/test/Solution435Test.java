package com.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Solution435Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEraseOverlapIntervals() {
		/*
		 * Wrong Answer: input:[[0,2],[1,3],[2,4],[3,5],[4,6]] Output:1 Expected:2 stdout:
		 */
		assertEquals(2, new com.leetcode.s435.Solution().eraseOverlapIntervals(new int[][] {{0,2},{1,3},{2,4},{3,5},{4,6}}));
		assertEquals(1, new com.leetcode.s435.Solution().eraseOverlapIntervals(new int[][] {{1,2},{1,3}}));
		assertEquals(0, new com.leetcode.s435.Solution().eraseOverlapIntervals(new int[][] {{1,2},{2,3}}));
		assertEquals(1, new com.leetcode.s435.Solution().eraseOverlapIntervals(new int[][] {{1,2},{2,3},{3,4},{1,3}}));
		assertEquals(2, new com.leetcode.s435.Solution().eraseOverlapIntervals(new int[][] {{1,2},{1,2},{1,2}}));
		

		
	}

}
