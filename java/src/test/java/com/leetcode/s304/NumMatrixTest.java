package com.leetcode.s304;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NumMatrixTest {

	/*
	 * 
	 * 给定 matrix = [
					  [3, 0, 1, 4, 2],
					  [5, 6, 3, 2, 1],
					  [1, 2, 0, 1, 5],
					  [4, 1, 0, 1, 7],
					  [1, 0, 3, 0, 5]
					]
					
					sumRegion(2, 1, 4, 3) -> 8
					sumRegion(1, 1, 2, 2) -> 11
					sumRegion(1, 2, 2, 4) -> 12
					
						 * 
	 */
	
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[][] matrix  = 
				new int[][] {{3, 0, 1, 4, 2},
							{5, 6, 3, 2, 1},
							{1, 2, 0, 1, 5},
							{4, 1, 0, 1, 7},
							{1, 0, 3, 0, 5}};
		
		Assert.assertEquals(8, new com.leetcode.s304.NumMatrix(matrix).sumRegion(2, 1, 4, 3));
		matrix  = new int[][] {{-4,-5}};
		Assert.assertEquals(-9, new com.leetcode.s304.NumMatrix(matrix).sumRegion(0,0, 0,1));
					
	}

}
