package com.leetcode.s341;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInteger item = new NestedInteger();
		
		List<NestedInteger>  nestedList = new ArrayList<>(); 
		nestedList.add(item);
		NestedIterator it = new NestedIterator(nestedList);
		while(it.hasNext()) {
			System.out.println(String.valueOf(it.next()));
		}

	}

}
