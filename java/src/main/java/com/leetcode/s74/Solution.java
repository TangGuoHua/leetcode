package com.leetcode.s74;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 ) {
            return false;
        }
        int m = matrix.length; 
        int n = matrix[0].length; 
        if(m == 0 || n == 0) return false;

         int i = m -1, j = 0; 
         int cur = matrix[i][j];
         while( i >= 0 && j >= 0 && j < n && i < m){
             if(target == cur){
                 return true;
             }
             else if( target > cur ){
                j++;
             }
             else {
                 i--;
             }
             if(i < 0 || j >= n) {
                 return false;
             }
             cur = matrix[i][j];
         }
         return false;
    }
}