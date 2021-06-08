package com.leetcode.s740;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testDeleteAndEarn() {
    int[] nums= new int[]{3,4,2};
    assertEquals(new com.leetcode.s740.Solution().deleteAndEarn(nums),6);
  }
}