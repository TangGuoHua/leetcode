package com.leetcode.s560;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static void main(String[] args) {
    Solution sl = new Solution();
    int[] nums = new int[]{1,1,1};
    int k = 2;
    ;
    System.out.println(sl.subarraySum(nums, k));
  }
  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0,1);
    int sum = 0, rst = 0;
    for(int i = 0; i < nums.length; i++){
      sum += nums[i];
      if(map.containsKey(sum - k)){
        rst += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum,0)+1);
    }
    return rst;
  }
}
