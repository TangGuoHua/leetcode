package com.leetcode.s1190;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

  public void testReverseParentheses() {
    assertEquals("apmnolkjihgfedcbq", new com.leetcode.s1190.Solution().reverseParentheses("a(bcdefghijkl(mno)p)q"));
  }
}