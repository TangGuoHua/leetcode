package com.leetcode.s132;

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
	public void testMinCut() {
		Assert.assertEquals(0, new com.leetcode.s132.Solution().minCut("aba"));
		Assert.assertEquals(1, new com.leetcode.s132.Solution().minCut("aab"));

	}

}
