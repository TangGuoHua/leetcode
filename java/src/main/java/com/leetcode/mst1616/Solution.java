package com.leetcode.mst1616;

public class Solution {

  public int[] subSort(int[] array) {
    int n = array.length;
    int curMin = Integer.MIN_VALUE;
    int curMax = Integer.MAX_VALUE;
    int[] rst = new int[]{-1,-1};
    for(int i = n - 1, j = n - i - 1; i >= 0; i--){
      if(array[i] > curMin){
        rst[0] = i;
      }
      else{
        curMin = Math.min(curMin,array[i]);
      }
      if(array[j]< curMax){
        rst[1] = j;
      }
      else{
        curMax = Math.max(curMax,array[j]);
      }
    }
    return rst;
  }
}
