package com.leetcode.mst1621;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int[] findSwapValues(int[] array1, int[] array2) {
    int sum1 = 0, sum2 = 0, sumavg = 0;

    Set<Integer> set2 = new HashSet<>();

    for(int num: array1){
      sum1 += num;
    }
    for(int num : array2){
      set2.add(num);
      sum2 += num;
    }
    if((sum1+sum2)%2!=0){
      return new int[]{};
    }
    sumavg = (sum1+sum2)/2;

    int diff = sum1 - sumavg;

    	// there must be a number in array1, let's say x , x - diff in array2[j]
      for(int num : array1){
        if(set2.contains(num - diff)){
          return new int[]{num, num-diff};
        }
      }

    return new int[]{};

  }
}