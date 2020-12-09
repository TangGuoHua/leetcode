package com.leetcode.s389;

import java.util.LinkedList;
import java.util.Queue;
import utils.ArrayUtils;

class Solution {

  public static void main(String[] args) {
    Solution t = new Solution();
    int[][] matrix = new int[][]{ {9,9,4},
                                  {6,6,8},
                                  {2,1,1}};
    ;
    System.out.println(t.longestIncreasingPath(matrix));
  }
  public int longestIncreasingPath(int[][] matrix) {

    // push all the node with outdegree == 0 to queue.

    // after process node in tree, update all of his neighbore vertices
    if(matrix == null || matrix.length == 0){
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int[][]  outdegree = new int[m][n];
    int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    Queue<int[]> q = new LinkedList<>();

    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        for(int[] d : dirs){
          int x = i + d[0];
          int y = j + d[1];
          if(x >= 0 && x < m && y >= 0 && y < n){
            if(matrix[x][y] > matrix[i][j]){
              outdegree[i][j]++;
            }
          }

        }
        if(outdegree[i][j] == 0){
          q.offer(new int[]{i,j});
        }
      }
    }
 System.out.println("n = "+n+"  m="+m);
    int level = 0;
    while(!q.isEmpty()){
      int size = q.size();
      for(int i = 0; i < size; i++){
        int[] cur = q.poll();
        for(int[] d : dirs){
          int x = cur[0] + d[0];
          int y = cur[1] + d[1];
         // System.out.println("cur[0]="+cur[0]+" cur[1]"+cur[1]);
         // System.out.println("x = "+x+" y="+y);
          if(x >= 0 && x < m && y >=0 && y < n && matrix[x][y] < matrix[cur[0]][cur[1]]){
            outdegree[x][y]--;
            if(outdegree[x][y] == 0){
              q.offer(new int[]{x,y});
            }
          }
        }
      }
      level++;
    }
    return level;
  }
}