package com.leetcode.s740;

import java.util.Arrays;

public class Solution {

  public int deleteAndEarn(int[] nums) {
    if(nums == null) {
      return 0;
    }
    if(nums.length < 2) {
      return nums[0];
    }

    int max = Arrays.stream(nums).max().getAsInt();
    int[] sum = new int[max+1];

    for(int num : nums){
      sum[num] += num;
    }

    int first = sum[0];
    int second = Math.max(sum[0],sum[1]);

    for(int i = 2; i < sum.length; i++ ){
      int tmp = second;
      second = Math.max(first+sum[i], second);
      first = tmp;
    }
    return second;
  }
}
