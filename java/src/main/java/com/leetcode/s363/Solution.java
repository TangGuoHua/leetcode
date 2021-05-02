package com.leetcode.s363;

import java.util.TreeSet;

public class Solution {


  public int[] getMaxMatrix(int[][] matrix)  {


    int m = matrix.length;
    int n = matrix[0].length;
    int ans = matrix[0][0];
    int[] dp = new int[n+1];
    int[] rst = new int[4];
    for (int r1 = 0; r1 < m; r1++) {

      int[] nums = new int[n];

      for (int r2 = r1; r2 < m; r2++) {
        for (int i = 0; i < n; i++) {

          nums[i] += matrix[r2][i];
        }

        for(int x = 0; x < n; x++){
          dp[x+1] = Math.max(dp[x]+nums[x], nums[x]);
          if(dp[x+1]> ans){
            updateRst(r1, dp[x]+nums[x] > nums[x]?0:x, r2,x, rst);
          }
        }
      }
    }
    return rst;
  }

  private int[] getMaxSubArray(int[] nums){
    int[] dp = new int[nums.length + 1];
    int start= 0, end= 0;
    int ans = 0;
    int[] rst = new int[2];
    for(int i = 0; i < nums.length;i++){
      //dp[i+1] = Math.max(nums[i], nums[i]+dp[i]);
      if(nums[i] > dp[i]+nums[i]){
        start = i;

        dp[i+1] = nums[i];
      }
      else{
        dp[i+1] = nums[i] + dp[i];
      }
      end = i;
      if(dp[i+1] > ans){
        rst = new int[]{start, end};
      }
    }
    return rst;
  }
  private void updateRst(int startx, int starty, int endx, int endy, int[] rst){
    rst[0] = startx;
    rst[1] = starty;
    rst[2] = endx;
    rst[3] = endy;
  }
}
