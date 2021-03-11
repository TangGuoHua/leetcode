package com.leetcode.s503;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
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
	public void testNextGreaterElements() {
		int[] nums = new int[] {1,2,1};
		// expect [2,-1,2]
//		Assert.assertArrayEquals(new int[] {2,-1,2}, new com.leetcode.s503.Solution().nextGreaterElements(nums));
		nums = new int[] {1,2,3,2,1};
		Assert.assertArrayEquals(new int[] {2,3,-1,3,2}, new com.leetcode.s503.Solution().nextGreaterElements(nums));
	}

}
