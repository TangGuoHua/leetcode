package com.leetcode.s84;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        int[] heights = new int[] {2,1,5,6,2,3};
        Assert.assertEquals(10, new com.leetcode.s84.Solution().largestRectangleArea(heights));
        heights = new int[] {2,1,5};
        Assert.assertEquals(5, new com.leetcode.s84.Solution().largestRectangleArea(heights));
        heights = new int[] {0};
        Assert.assertEquals(0, new com.leetcode.s84.Solution().largestRectangleArea(heights));
        heights = new int[] {};
        Assert.assertEquals(0, new com.leetcode.s84.Solution().largestRectangleArea(heights));
        heights = new int[] {2,1,2};
        Assert.assertEquals(3, new com.leetcode.s84.Solution().largestRectangleArea(heights));
    }

}
