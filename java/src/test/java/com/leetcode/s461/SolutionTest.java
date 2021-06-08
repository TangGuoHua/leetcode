package com.leetcode.s461;

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
    public void testHammingDistance() {
        
        Assert.assertEquals(2, new com.leetcode.s461.Solution().hammingDistance(1, 4));
    }

}
