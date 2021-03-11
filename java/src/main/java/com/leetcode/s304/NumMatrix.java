package com.leetcode.s304;



public class NumMatrix {
    int[][] sum = null;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        sum = new int[m+1][n+1];
        // process first row;
        for(int j = 1; j <=n; j++){
            sum[1][j] = sum[1][j-1]+matrix[0][j-1];
        }
        // process first column
        for(int i = 1; i <= m; i++){
            sum[i][1] = sum[i-1][1]+matrix[i-1][0];
        }
        // process the remain 
        for(int i = 2; i <= m; i++){
            for(int j = 2; j <= n; j++){
                sum[i][j] = matrix[i-1][j-1] - sum[i-1][j-1]+sum[i][j-1]+sum[i-1][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2+1][col2+1] + sum[row1][col1] - sum[row1][col2+1] - sum[row2+1][col1];
    }
}
