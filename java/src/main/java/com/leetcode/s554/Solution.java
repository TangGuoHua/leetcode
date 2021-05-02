package com.leetcode.s554;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
  public int leastBricks(List<List<Integer>> wall) {
    // row set , prefix sum for each row.
    // map, prefix sum -> count.

    // count the prefix sum for each row, find the max count
    int maxprefix = 1;
    int cnt = 0;
    List<Set<Integer>> prefixSet = new ArrayList<>();
    int i = 0;
    int total = wall.get(0).stream().reduce((a,b)->a+b).get();
    Map<Integer, Integer> map = new HashMap<>();
    for(List<Integer> row : wall){
      int sum = 0;
      prefixSet.add(new HashSet<Integer>());
      for(int brick : row){
        sum += brick;
        prefixSet.get(i).add(sum);
        System.out.println("第 "+i+" 行当前 前缀和为 : "+sum);
        map.put(sum, map.getOrDefault(sum, 0)+1);
        if(map.get(sum) > cnt && sum < total){
          cnt = map.get(sum);
          maxprefix = sum;

        }
      }
      i++;
    }
    System.out.println("最大相同前缀和为"+maxprefix);
    int rst = 0;
    for(Set<Integer> rowPrefixSum : prefixSet){
      if(!rowPrefixSum.contains(maxprefix)){
        rst++;
      }
    }
    return rst;
  }
}