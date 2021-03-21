package com.leetcode.s150;

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
    public void testEvalRPN() {
        Assert.assertEquals(2, new com.leetcode.s150.Solution().evalRPN(new String[] {"2"}));

        
        Assert.assertEquals(2, new com.leetcode.s150.Solution().evalRPN(new String[] {"2"}));

        Assert.assertEquals(9, new com.leetcode.s150.Solution().evalRPN(new String[] {"2","1","+","3","*"}));
    }

}
