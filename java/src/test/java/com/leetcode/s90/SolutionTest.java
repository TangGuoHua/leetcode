package com.leetcode.s90;

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
    public void testSubsetsWithDup() {
        int[] nums = new int[] {1,2,2};
        Assert.assertEquals(6, new com.leetcode.s90.Solution().subsetsWithDup(nums));
    }

}
