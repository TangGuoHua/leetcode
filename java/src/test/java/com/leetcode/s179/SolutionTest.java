package com.leetcode.s179;

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
	public void testLargestNumber() {
		Solution t = new Solution();
		String rst = t.largestNumber(new int[] {21,9,5});
		Assert.assertEquals("9521", rst);
	}

}
