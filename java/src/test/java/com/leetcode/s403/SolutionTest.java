package com.leetcode.s403;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

  @Test
  public void test1(){
    int[] stones = new int[]{0,1,2,3,4,8,9,11};
    assertEquals( false, new com.leetcode.s403.Solution().canCross(stones));
  }

}