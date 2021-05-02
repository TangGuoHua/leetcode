package com.leetcode.s220;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Solution {



  public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    TreeMap<Long, Integer> map = new TreeMap<>();

    for(int i = 0; i < nums.length; i++){
      if(map.ceilingKey((long)nums[i] - t) != null && calculateDistance(i, nums, map.tailMap((long)nums[i] - t, true),k,t)){
        return true;
      }
      if(map.floorKey((long)nums[i] + t) != null && calculateDistance(i, nums, map.headMap((long)nums[i] + t, true),k,t)){
        return true;
      }
      map.put((long)nums[i],i);
    }
    return false;
  }

  private boolean calculateDistance(int i, int[] nums,  Map<Long, Integer> map, int k, int t){
    for(Map.Entry<Long, Integer> entry : map.entrySet()){
      if(Math.abs(nums[i] - entry.getKey()) <= t && Math.abs(entry.getValue() - i) <= k){
        return true;
      }
    }
    return false;
  }
}
