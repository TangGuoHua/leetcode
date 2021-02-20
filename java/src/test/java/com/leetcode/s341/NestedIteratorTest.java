package com.leetcode.s341;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NestedIteratorTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test1() {
		//[1,[4,[6]]]
		//expect 1 4 6
		
		NestedInteger e6 = new NestedInteger(6);
		NestedInteger list = new NestedInteger(); 
		list.add2List(e6);
		
		NestedInteger e4 = new NestedInteger();
		e4.add2List(new NestedInteger(4));
		e4.add2List(list);
		
		NestedInteger e1 = new NestedInteger(); 
		e1.add2List(new NestedInteger(1));
		e1.add2List(e4);
		
		List<NestedInteger>  input = new ArrayList<>(); 
		input.add(e1);
		NestedIterator it = new NestedIterator(input);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void test2() {
		//[[],[3]]
		NestedInteger list1 = new NestedInteger(); 
		NestedInteger list2 = new NestedInteger(); 
		list2.add2List(new NestedInteger(3));
		List<NestedInteger> input = new ArrayList<>(); 
		input.add(list1);
		input.add(list2);
		NestedIterator it = new NestedIterator(input);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void test3() {
		//[[],[3]]
		NestedInteger list1 = new NestedInteger(); 
		List<NestedInteger> input = new ArrayList<>(); 
		input.add(list1);
		NestedIterator it = new NestedIterator(input);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

