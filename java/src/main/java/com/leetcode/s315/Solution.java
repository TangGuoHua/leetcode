package com.leetcode.s315;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

  public static void main(String[] args) {
    Solution t = new Solution();
    //System.out.println(t.countSmaller(new int[]{5,2,6,1}));

  }

  private int reversePairs(int[] nums, int left, int mid, int right){

    if(left == right){
      return 0;
    }
    int i = left, j = mid + 1;
    int count = 0;
    while(i <= mid || j <= right){


      if(i <= mid && nums[i] <= nums[j]){
        i++;
      }
      else{
        j++;
        count += mid - i + 1;
      }
    }
    return count;
  }

  int[] freq = null;
  int[] sum = null;
  List<Integer> rst = null;
  Map<Integer, Integer> rank = null;
  int n = 0;
  public List<Integer> countSmaller(int[] nums) {
    // 1. remove duplicate and give each number a rank
    rank = new HashMap<>();
    rankTheNumber(nums, rank);
    // 2. initialize a freq array
    n = rank.size();
    freq = new int[rank.size()];
    sum = new int[rank.size()+1];
    List<Integer> rst = new ArrayList<>();
    // 3. scan from right to left. update the freq array for the current num.
    for(int i = nums.length -1 ; i >= 0; i--){
      // System.out.println("rank.get(nums[i])="+rank.get(nums[i]));
      update(rank.get(nums[i]),1);
      //System.out.println(Arrays.toString(sum));
      // 4. count sumRange of the freq array. push it to ressult.
      rst.add(getRange(rank.get(nums[i])));
    }
    Collections.reverse(rst);
    return rst;
  }

  private int getRange(int i){
    int rst = 0;
    while( i > 0){
      rst += sum[i];
      i -= lowbit(i);
    }
    return rst;
  }
  private void update(int i, int delta){
    freq[i] += delta;
    i = i+1;
    while( i <= n){
      sum[i] += delta;
      i += lowbit(i);
    }
  }

  private int lowbit(int i){
    return i & (-i);
  }
  private void rankTheNumber(int[] nums, Map<Integer, Integer> rank){
    Set<Integer> set = new HashSet<>();

    for(int num : nums){
      set.add(num);
    }
    List<Integer> list = new ArrayList<>(set);
    Collections.sort(list);

    for(int i = 0; i < list.size(); i++){
      rank.put(list.get(i), i);
    }
    //  System.out.println(rank.toString());
  }
}
