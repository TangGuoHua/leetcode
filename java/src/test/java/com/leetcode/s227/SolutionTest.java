package com.leetcode.s227;

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
    public void testCalculate() {
//        Assert.assertEquals(7   , new com.leetcode.s227.Solution().calculate("3+2*2"));
//        Assert.assertEquals(1   , new com.leetcode.s227.Solution().calculate("3/2"));
//        Assert.assertEquals(5   , new com.leetcode.s227.Solution().calculate(" 3+5/2 "));
//        Assert.assertEquals(42   , new com.leetcode.s227.Solution().calculate(" 42 "));
//        Assert.assertEquals(-2147483647   , new com.leetcode.s227.Solution().calculate("0-2147483647"));
        Assert.assertEquals(1   , new com.leetcode.s227.Solution().calculate("1 -1 +1"));

        
    }

}
