package com.leetcode.s149;

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
	public void testMaxPoints() {
		//[[1,1],[2,2],[3,3]] ==> 3
		Assert.assertTrue(3 == new com.leetcode.s149.Solution().maxPoints(new int[][]{{0,0},{1,1},{0,0}}));

		Assert.assertTrue(3 == new com.leetcode.s149.Solution().maxPoints(new int[][]{{1,1},{2,2},{1,1}}));

		Assert.assertTrue(3 == new com.leetcode.s149.Solution().maxPoints(new int[][]{{1,1},{2,2},{3,3}}));
	}

}
