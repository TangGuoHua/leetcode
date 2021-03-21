package com.leetcode.s1791;

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
    public void testFindCenter() {
        int[][] edges = new int[][] {{1,2},{2,3},{4,2}};
        Assert.assertEquals(2, new com.leetcode.s1791.Solution().findCenter(edges));
    }

}
