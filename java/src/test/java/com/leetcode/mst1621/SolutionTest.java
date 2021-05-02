package com.leetcode.mst1621;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest extends TestCase {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test1(){
    int[] array1 = new int[]{4, 1, 2, 1, 1, 2};
    int[] array2 = new int[]{3, 6, 3, 3};
    int[] rst = new com.leetcode.mst1621.Solution().findSwapValues(array1,array2);
    assertEquals(rst.length,2);
  }

  @Test
  public void test2(){
    int[] array1 = new int[]{4, 1, 2, 1, 1, 2};
    int[] array2 = new int[]{3, 6, 3, 3};
    int[] rst = new com.leetcode.mst1621.Solution().findSwapValues(array1,array2);
    assertEquals(rst.length,2);
  }
}