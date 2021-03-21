package com.leetcode.s84;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftLow = new int[n];
        int[] rightLow = new int[n]; 
        int result = 0; 
        
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i = 0; i < n; i++){
            
            if(i == 0){
                leftLow[i] = -1;
            }
            else{
                while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    leftLow[i] = -1;
                }
                else{
                    leftLow[i] = stack.peek();
                }
            }
            stack.push(i);      

        }
        stack.clear();

        for(int i = n - 1; i >= 0; i--){
            if( i == n -1){
                rightLow[i] = n;
            }
            else{
                while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    rightLow[i] = n;
                }
                else{
                    rightLow[i] = stack.peek();
                }
            }
            stack.push(i);
        }
        
        System.out.println(Arrays.toString(leftLow));
        System.out.println(Arrays.toString(rightLow));

        for(int i = 0; i < n; i++){
            int width = rightLow[i] - leftLow[i] -1; 
//            System.out.println("对"+i+" 个元素而言， 做边界是 ："+leftLow[i]+ " 右边界是： "+ rightLow[i]+"宽度是 ： "+ width);
//            System.out.println("面结是 ： "+width*heights[i] );
//            
            result = Math.max(result, width*heights[i]);
        }
        return result;
    }
}
