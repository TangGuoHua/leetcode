package com.leetcode.s1769;

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
    public void testMinOperations() {
        Assert.assertArrayEquals(new int[] {}, new com.leetcode.s1769.Solution().minOperations(""));

        Assert.assertArrayEquals(new int[] {0}, new com.leetcode.s1769.Solution().minOperations("1"));

        Assert.assertArrayEquals(new int[] {1,1,3}, new com.leetcode.s1769.Solution().minOperations("110"));
        Assert.assertArrayEquals(new int[] {11,8,5,4,3,4}, 
                new com.leetcode.s1769.Solution().minOperations("001011"));

    }

}
