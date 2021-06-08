package com.leetcode.s74;

import static org.junit.Assert.*;

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
        
        int[][] matrix = new int[][] {{1,3,5,7},
                                      {10,11,16,20},
                                      {23,30,34,60}};
        int target = 3;
        Assert.assertTrue(new com.leetcode.s74.Solution().searchMatrix(matrix, target));
        target = 2;
        Assert.assertFalse(new com.leetcode.s74.Solution().searchMatrix(matrix, target));
        matrix = new int[][] {{1}};
        target = 2;
        Assert.assertFalse(new com.leetcode.s74.Solution().searchMatrix(matrix, target));
        
        matrix = new int[][] {{}};
        target = 2;
        Assert.assertFalse(new com.leetcode.s74.Solution().searchMatrix(matrix, target));
        
    }

}
