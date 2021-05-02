package com.leetcode.s220;

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
  public void test() {
    int[] nums = new int[]{1,2,3,1};
    int k = 3;
    int t = 0;
    Assert.assertTrue(new com.leetcode.s220.Solution().containsNearbyAlmostDuplicate(nums,k,t));

    nums = new int[]{1,0,1,1};
    k = 1;
    t = 2;
    Assert.assertTrue(new com.leetcode.s220.Solution().containsNearbyAlmostDuplicate(nums,k,t));

    nums = new int[]{1,5,9,1,5,9};
    k = 2;
    t = 3;
    Assert.assertFalse(new com.leetcode.s220.Solution().containsNearbyAlmostDuplicate(nums,k,t));

    nums = new int[]{-2147483648,2147483647};
    k = 1;
    t = 1;
    Assert.assertFalse(new com.leetcode.s220.Solution().containsNearbyAlmostDuplicate(nums,k,t));

  }
}
