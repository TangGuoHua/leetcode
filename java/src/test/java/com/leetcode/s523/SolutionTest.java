package com.leetcode.s523;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testCheckSubarraySum() {
    int[] nums = new int[]{1,2,12};
    int k = 6;
    assertTrue(new com.leetcode.s523.Solution().checkSubarraySum(nums, k));
  }
  public void testCheckSubarraySum2() {
    int[] nums = new int[]{1,2,12};
    int k = 6;
    assertTrue(new com.leetcode.s523.Solution().checkSubarraySum2(nums, k));
  }
}