package com.leetcode.s456;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>(); 
        int n = nums.length; 
        if( n < 3) return false;
        int r_max = Integer.MIN_VALUE;
        stack.push(nums[n-1]);
        for(int i = n-2; i >= 0; i--){
            
            // nums[i] 是否可以作为1
            if(nums[i] < r_max && nums[i] < stack.peek()){
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()){
                r_max = Math.max(r_max,stack.pop());
            }
            stack.push(nums[i]);
            
            
            
        }
        return false;
    }
}
