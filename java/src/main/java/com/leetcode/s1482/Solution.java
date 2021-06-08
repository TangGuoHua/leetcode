package com.leetcode.s1482;

class Solution {
  public int minDays(int[] bloomDay, int m, int k) {

    int left = Integer.MAX_VALUE;
    int right = 0;
    for(int day : bloomDay){
      left = Math.min(left, day);
      right = Math.max(right, day);
    }

    while(left < right){

      int mid = left + (right- left)/2;

      if(canMake(bloomDay, m, k, mid)){
        right = mid;
      }
      else{
        left = mid + 1;
      }
    }
    return left;
  }

  public  boolean canMake2(int[] bloomDay, int m, int k, int days){

    int bouquet = 0;
    int flowers = 0;
    for(int i = 0; i < bloomDay.length; i++){
      if (bloomDay[i] <= days) {
        flowers++;
        if (flowers == k) {
          bouquet++;
          flowers = 0;
        }
      } else {
        flowers = 0;
      }

    }
    return bouquet >= m;
  }
  public boolean canMake(int[] bloomDay, int m, int k, int days){

    int bouquet = 0;
    int flowers = 0;
    for(int i = 0; i < bloomDay.length; i++){


      if(bloomDay[i] <= days){
        flowers++;
      }
      else{
        flowers = 0;
      }

      if(flowers == k){
        bouquet++;
        flowers= 0;
      }
      if(bouquet == m){
        return true;
      }

    }
    return false;
  }
}
