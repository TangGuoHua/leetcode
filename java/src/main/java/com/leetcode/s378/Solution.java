package com.leetcode.s378;

import java.util.Arrays;

public class Solution {

  public int kthSmallest(int[][] matrix, int k) {

    int n = matrix.length;
    int left = matrix[0][0], right = matrix[n-1][n-1];
    int mid = left + (right - left)/2;

    int count = 0; // count the number of numbers small than the mid;
        /*
        left == 1, right == 15, mid = 8, count = 2 < 8;  =>  left = mid = 8;
        left == 8, right == 15, mid =
        */
    while(left < right){

      count = countLess(matrix, mid);
      if(count < k){
        left = mid + 1;
      }
      else{ //( count >= k)
        right = mid -1;
      }
      mid = left + (right - left)/2;
    }
    return left;
  }

  private int countLess(int[][] matrix, int mid){
    int result = 0;
    for(int i = 0; i <matrix.length; i++){
      int id =  Arrays.binarySearch(matrix[i], 0, matrix.length, mid);
      if(id < 0){
        id = -id +1;
      }
      if(id == 0) break;
      result += id;
    }
    return result;
  }
}
