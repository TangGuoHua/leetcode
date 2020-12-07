package com.leetcode.s307;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    int[] nums = new int[] {1,3,5};
    NumArray sl = new NumArray(nums);
    System.out.println("after initialize = "+ Arrays.toString(sl.A));
    System.out.println("after initialize sum = "+ Arrays.toString(sl.sum));
    System.out.println("sumRange(0,2) = "+sl.sumRange(0,2));
    System.out.println("update(1,2)=" );
    sl.update(1,2);
    System.out.println(Arrays.toString(sl.A));
    sl.update(1,2);
    System.out.println("sumRange(0,2) = "+sl.sumRange(0,2));

  }
}

class NumArray {

  int[] A = null;
  int n = 0;
  int[] sum = null;
  public NumArray(int[] nums) {
    n = nums.length;
    A = new int[n];
    sum = new int[n+1];
    for(int i = 0; i < n; i++){
      update(i, nums[i]);
    }
  }

  public void update(int i, int val) {
    int delta = val - A[i];
    A[i] += delta;
    i = i+1;
    while( i <= n){
      sum[i] += delta;
      i += lowbit(i);
    }
  }

  public int sumRange(int i, int j) {
    return getRange(j+1) - getRange(i);
  }
  private int getRange(int i){

    int rst = 0;
    while(i > 0){
      rst += sum[i];
      i -= lowbit(i);
    }
    return rst;
  }
  private int lowbit(int i){
    return (i&(-i));
  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */