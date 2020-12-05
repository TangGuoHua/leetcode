package com.leetcode.s307;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> countSmaller(int[] nums) {
    List<Integer> rst = new ArrayList<>();

    return rst;
  }
}

class Fenwick{
  int[] sum = null;
  int[] nums = null;
  int n = 0;
  public Fenwick(int[] A){
     n = A.length;
    sum = new int[n+1];
    nums = new int[n];
    for(int i = 0; i < n; i++){
      add(i, A[i]);
    }
  }
  public void add(int x, int delta){
    nums[x] += delta;
    x = x+1;
    while(x <= n){
      sum[x] += delta;
      x += lowbit(x);
    }
  }
  public int getSum(int i){
    int rst = 0;
    while( i > 0){
      rst += sum[i];
      i -= lowbit(i);
    }
    return rst;
  }
  private int lowbit(int x){
    return x&(-x);
  }
}
