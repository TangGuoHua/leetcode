package com.leetcode.s523;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

  public boolean checkSubarraySum2(int[] nums, int k) {

    int n = nums.length;
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0,-1);
    for(int i = 0; i<n; i++){
      sum+=nums[i];
      int t = (k==0)?sum:sum%k;
      if(map.containsKey(t)){
        if(i-map.get(t)>1){
          return true;
        }
      }
      else{
        map.put(t,i);
      }

    }
    return false;

  }
  public boolean checkSubarraySum(int[] nums, int k) {
    if(nums == null || nums.length < 2){
      return false;
    }
    int[] sum = new int[nums.length];
    sum[0] = nums[0];
    for(int i = 1; i < nums.length; i++){
      sum[i] = sum[i-1] + nums[i];
    }

    Set<Integer> set = new HashSet<>();
    set.add(0);
    for(int i = 0; i < sum.length; i++){
      // if there is a number x = nums[i]%k exists in map
      if(i == 0) continue;
      if(set.contains(sum[i]%k) ){
        return true;
      }
      set.add(sum[i]%k);
    }
    return false;
  }

}
