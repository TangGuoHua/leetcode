package com.leetcode.s88;

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
    public void testMerge() {
        int m = 3, n =3;
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        Assert.assertArrayEquals(new int[] {1,2,2,3,5,6}, 
                new com.leetcode.s88.Solution().merge(nums1, m, nums2, n));
        Assert.assertArrayEquals(new int[] {1}, 
                new com.leetcode.s88.Solution().merge(new int[] {0}, 0, new int[] {1}, 1));
    }

}
