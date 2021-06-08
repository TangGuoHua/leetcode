package com.leetcode.s456;

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
    public void testFind132pattern() {
        Assert.assertEquals(false, new com.leetcode.s456.Solution().find132pattern(new int[] {0,3,4}));
        Assert.assertEquals(true, new com.leetcode.s456.Solution().find132pattern(new int[] {-1,3,2,0}));


        Assert.assertEquals(true, new com.leetcode.s456.Solution().find132pattern(new int[] {3,5,0,3,4}));

        Assert.assertEquals(true, new com.leetcode.s456.Solution().find132pattern(new int[] {3,1,4,2}));
    }

}
