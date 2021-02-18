package com.leetcode.s179;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
	
	public String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>(); 
        for(int num : nums){
            list.add(num);
        }
        Collections.sort(list, (a,b)->a.compareTo(b));

        StringBuilder sb = new StringBuilder();
        for(Integer num : list){
            sb.append(String.valueOf(num));
        }
        
        while(sb.charAt(0)=='0' && sb.length() > 1) {
        	sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    
   
}