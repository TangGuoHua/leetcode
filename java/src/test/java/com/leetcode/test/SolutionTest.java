package com.leetcode.test;

import static org.junit.Assert.*;

import org.junit.After;
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
	public void test1() {
		assertTrue(new com.leetcode.s10.Solution().isMatch("ab",".*"));

	}
	@Test
	public void test2() {
		assertTrue(new com.leetcode.s10.Solution().isMatch("as","a.*s"));

	}
	@Test
	public void test3() {
		assertTrue(new com.leetcode.s10.Solution().isMatch("",".*"));

	}
	
	@Test
	public void test4() {
		assertArrayEquals(new int[] {1}, new int[] {1} );
	}

}
