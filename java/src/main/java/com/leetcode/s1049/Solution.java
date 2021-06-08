package com.leetcode.s1049;

class Solution {
  public int lastStoneWeightII(int[] stones) {
    int n = stones.length;
    int sum= 0;
    for(int stone : stones){
      sum += stone;
    }
    int target = sum/2;
    
    int[] dp = new int[target+1];
    int ans = 0;
    for(int stone : stones){
      for(int j = target ; j >= stone; j--){
         dp[j] += dp[j-stone]+stone;
         ans = Math.max(ans, dp[j]);
      }
    }
    return ans;
  }
}
