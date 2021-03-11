package com.leetcode.s218;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SolutionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[][] buildings = new int[][] {{1,11,5},{2,6,7}};
//		Assert.assertEquals(3, new com.leetcode.s218.Solution().getSkyline(buildings).size());
//		buildings = new int[][] {{1,11,5},{2,6,7},{3,13,9}};
//		Assert.assertEquals(3, new com.leetcode.s218.Solution().getSkyline(buildings).size());
//		buildings = new int[][] {{12,7,16},{14,3,25}};
//		Assert.assertEquals(3, new com.leetcode.s218.Solution().getSkyline(buildings).size());
//		buildings = new int[][]{{2,9,10},{3,7,15}};
//		Assert.assertEquals(4, new com.leetcode.s218.Solution().getSkyline(buildings).size());
//		buildings = new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
//		Assert.assertEquals(7, new com.leetcode.s218.Solution().getSkyline(buildings).size());
		buildings = new int[][]{{1,2,1},{1,2,2},{1,2,3}};
		Assert.assertEquals(2, new com.leetcode.s218.Solution().getSkyline(buildings).size());

	}

}
