package com.leetcode.s309;

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
    	
    	int n = prices.length;
    	int[] hold = new int[n + 1];
    	int[] sold = new int[n + 1];
    	int[] freeze = new int[n + 1];
    	System.out.println("prices =    "+Arrays.toString(prices));
    	hold[0] = - prices[0];
    	sold[0] = 0; 
    	freeze[0] = 0; 
    	for(int i = 1; i <= n; i++){
    		hold[i] = Math.max(hold[i-1], freeze[i-1]-prices[i-1]);
    		sold[i] = Math.max(hold[i-1] + prices[i-1], Math.max(freeze[i-1], sold[i-1]));
    		freeze[i] = sold[i-1];
    	}
    	
    	System.out.println("hold = "+ Arrays.toString(hold));
    	System.out.println("sold = "+ Arrays.toString(sold));
    	System.out.println(" freeze = "+ Arrays.toString(freeze));
    	return Math.max(freeze[n], sold[n]);
    }
    
    
}