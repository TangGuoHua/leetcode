package com.leetcode.s84;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    
    public int largestRectangleArea(int[] heights) {
        
        int result = maxArea(heights);
        reverse(heights);
        result = Math.max(result, maxArea(heights));
        return result;
    }
    
    private int maxArea(int[] heights){
        int result = 0; 
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for(int i = 0; i < heights.length; i++){
            
            while(stack.size() > 0 && stack.peek() != -1 && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            result = Math.max(result, (i - stack.peek())*heights[i]);
            stack.push(i);
        }
        return result;
        
    }  
        
    
    private void reverse(int[] heights) {
        int i = 0, j = heights.length - 1;
        while(i < j) {
            int t = heights[i];
            heights[i] = heights[j];
            heights[j] = t;
            i++;
            j--;
        }
        
    }

}
