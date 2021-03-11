package com.leetcode.s503;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
    	if(nums == null || nums.length == 0){
    		return new int[]{};
    	}

    	int n = nums.length; 
    	int[] result = new int[n];
    	Arrays.fill(result, -1);
    	Deque<Integer> stack = new ArrayDeque<>();
    	for(int i = 0; i < 2*n; i++){

    		while(stack.size() > 0 && nums[i%n] > nums[stack.peek().intValue()]){
    			result[stack.pop().intValue()] = nums[i%n];
    		}
    		stack.push(i%n);
    	}
    	System.out.println(Arrays.toString(result));
    	return result;
    }
}
