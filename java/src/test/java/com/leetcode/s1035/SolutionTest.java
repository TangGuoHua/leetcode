package com.leetcode.s1035;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testMaxUncrossedLines() {
    int[] nums1 = new int[]{1,4,2};
    int[] nums2 = new int[]{1,2,4};
    assertEquals(2,new com.leetcode.s1035.Solution().maxUncrossedLines(nums1,nums2));
  }

  public void testMaxUncrossedLines2() {
    int[] nums1 = new int[]{2,5,1,2,5};
    int[] nums2 = new int[]{10,5,2,1,5,2};
    assertEquals(3,new com.leetcode.s1035.Solution().maxUncrossedLines(nums1,nums2));
  }

  public void testMaxUncrossedLines3() {
    int[] nums1 = new int[]{1,3,7,1,7,5};
    int[] nums2 = new int[]{1,9,2,5,1};
    assertEquals(2,new com.leetcode.s1035.Solution().maxUncrossedLines(nums1,nums2));
  }
  public void testMaxUncrossedLines4() {
    int[] nums1 = new int[]{1};
    int[] nums2 = new int[]{1,9};
    assertEquals(1,new com.leetcode.s1035.Solution().maxUncrossedLines(nums1,nums2));
  }

}