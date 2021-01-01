package com.leetcode.s435;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
	public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(int[] item : intervals){
            list.add(item);
        }
        list.sort((a, b)->a[0] == b[0]? a[1]-b[1]:a[0]-b[0]);
        Deque<int[]> stack = new ArrayDeque<int[]>();
        int cnt = 0;
        for(int i = 0; i < list.size(); i++){
            if(stack.isEmpty()){
                stack.push(list.get(i));
            }
            else{
                int[] pre = stack.peek();
                if(isOverlapWithPrevious(list.get(i), pre)){
                    cnt++;
                    if(pre[1] > list.get(i)[1]){
                        stack.pop();
                        stack.push(list.get(i));
                    }
                }
                else {
                	stack.push(list.get(i));
                }

            }
        }
        return cnt; 
    }

    private boolean isOverlapWithPrevious(int[] cur, int[] pre){
        if(cur[0] < pre[1]){
            return true;
        }
        return false;
    }
}
