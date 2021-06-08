package com.leetcode.s781;

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
    public void testNumRabbits() {
        int[] answers = new int[] {1,1,2};
        Assert.assertEquals(5, new com.leetcode.s781.Solution().numRabbits(answers));
        answers = new int[] {10,10,10};
        Assert.assertEquals(11, new com.leetcode.s781.Solution().numRabbits(answers));
        answers = new int[] {1,0,1,0,0};
        Assert.assertEquals(5, new com.leetcode.s781.Solution().numRabbits(answers));
        answers = new int[] {1,1,1,0,0};
        Assert.assertEquals(6, new com.leetcode.s781.Solution().numRabbits(answers));
    }

}
