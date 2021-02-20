package com.leetcode.s57;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest extends TestCase {
  com.leetcode.s57.Solution s = new com.leetcode.s57.Solution();

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testInsert() {
    Assert.assertTrue(s.insert(new int[][]{{1,2},{5,6}}, new int[]{2,3}).length == 2);
  }
  @Test
  public void test2(){
    Assert.assertTrue(s.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4,8}).length == 3);
  }
  @Test
  public void test3(){
    Assert.assertTrue( s.insert(new int[][]{{1,5}},new int[]{6,8}).length == 2);
  }

}