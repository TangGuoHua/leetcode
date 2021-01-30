package com.leetcode.s140;

import java.util.Arrays;
import java.util.List;

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
	public void test() {
		List<String> result = new com.leetcode.s140.Solution().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog"));
		System.out.println(result);
		Assert.assertTrue(result.size() == 2);
		
	}

}
