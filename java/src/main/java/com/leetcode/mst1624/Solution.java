package com.leetcode.mst1624;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
  public List<List<Integer>> pairSums(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();
    for(int i = 0; i < nums.length; i++){
      int key = target - nums[i];
      if(map.containsKey(key)){
        List<Integer> tmp = new ArrayList<>();
        tmp.add(key);
        tmp.add(nums[i]);
        map.put(key, map.get(key)-1);
        if(map.get(key) == 0){
          map.remove(key);
        }
        result.add(tmp);
      }
      else{
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
    }
    return result;

  }

}