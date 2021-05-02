package com.leetcode.s337;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest extends TestCase {

  @Test
  public void test1(){
    int[] nums = new int[]{1,2,3};
    int target = 4;
    Assert.assertEquals(7,new com.leetcode.s337.Solution().combinationSum4(nums,target));
  }
  @Test
  public void test2(){
    int[] nums = new int[]{3};
    int target = 9;
    Assert.assertEquals(1,new com.leetcode.s337.Solution().combinationSum4(nums,target));
  }

@Test
  public void test3(){
    int[] nums = new int[]{9};
    int target = 3;
    Assert.assertEquals(0,new com.leetcode.s337.Solution().combinationSum4(nums,target));
  }


}