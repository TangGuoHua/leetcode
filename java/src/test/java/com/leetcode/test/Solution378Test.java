package com.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Solution378Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBinarySearch() {
		int[] nums = new int[] {2,3,3,3,4,5,6};
		assertEquals(1, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 3));
		nums = new int[] {2,3,3,3,4,5,6};
		assertEquals(0, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 2));
		nums = new int[] {2,3,3,3,4,5,6};
		assertEquals(6, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 6));
		nums = new int[] {2,3,3,3,4,6,7};
		assertEquals(5, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 6));
		nums = new int[] {1,2};
		assertEquals(1, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 2));
		nums = new int[] {1,3};
		assertEquals(1, new com.leetcode.s378.Solution().binarySeach(nums, 0, nums.length - 1, 2));
		
	}

}
