package com.leetcode.s295;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MedianFinderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		 MedianFinder mf = new MedianFinder();
//		 mf.addNum(1);
//		 mf.addNum(2);
//		 System.out.println(mf.findMedian());
//		 mf.addNum(3);
//		 System.out.println(mf.findMedian());
//	}
//	
	@Test
	public void test2() {
		/*
		 * ["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
[[],[-1],[],[-2],[],[-3],[],[-4],[],[-5],[]]
		 */
		MedianFinder mf = new MedianFinder();
		mf.addNum(-1);
		System.out.println(mf.findMedian());
		mf.addNum(-2);
		System.out.println(mf.findMedian());
		mf.addNum(-3);
		System.out.println(mf.findMedian());

	}

}
