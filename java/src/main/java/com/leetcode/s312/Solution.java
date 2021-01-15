package com.leetcode.s312;

public class Solution {
	public static void main(String[] args) {
		
		Solution s= new Solution();
		System.out.println(s.maxProduct(new int[] {3,-1,4}));//4
		System.out.println(s.maxProduct(new int[] {2,3,-2,4})); // 6
		System.out.println(s.maxProduct(new int[] {-2,0,-1})); //0
		System.out.println(s.maxProduct(new int[] {-2}));//-2
		System.out.println(s.maxProduct(new int[] {0,2}));//2
	}
	
	 public int maxProduct(int[] nums) {
		 if(nums.length < 2){
	            return nums[0];
	        }
	        int pre = 1;
	        int result = 0; 
	        int max = nums[0], min = nums[0];
	        for(int i = 0; i < nums.length; i++){
	           
	        	if(max*nums[i]< 0) {
	        		min = max*nums[i];
	        		
	        	}
	        	
	        	
	        }
	        return result;
	    }
    public int maxCoins(int[] nums) {
    	
    	int n = nums.length;
    	int[][] dp = new int[n+2][n+2];
    	int[] vals = new int[n+2];
    	for(int i = 1; i <= n; i++) {
    		vals[i] = nums[i-1];
    		dp[i][i] = vals[i];
    	}
    	vals[0] = vals[n+1] = 1;
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = i +2; j <= n + 1;j++) {
    			for(int k = i +1; k < j; k++) {
    				dp[i][j] = Math.max(dp[i][j],  vals[i]*vals[k]*vals[j] + dp[i][k]+dp[k][j]);
    			}
    		}
    	}
    	return dp[0][n+1];
    }
}