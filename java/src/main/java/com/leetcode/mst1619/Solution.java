package com.leetcode.mst1619;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

  public static void main(String[] args) {
    Solution s = new Solution();
    int[][] land = new int[][] {
        {1, 0, 4, 4, 2},
        {6, 4, 0, 9, 8},
        {8, 2, 2, 0, 5},
        {9, 0, 0, 0, 8}
    };
    ;
    System.out.println(Arrays.toString(s.pondSizes(land)));
  }
  public int[] pondSizes(int[][] land) {

    List<Integer> ponds = new ArrayList<>();

    for(int i = 0; i < land.length; i++){
      for(int j = 0; j < land[0].length; j++){
        if(land[i][j] == 0){
          ponds.add(fill(land, i, j));
        }
      }
    }
    Collections.sort(ponds);
    int[] rst = new int[ponds.size()];
    int i = 0;
    for(int pondSize : ponds){
      rst[i++] = pondSize;
    }
    return rst;
  }

  private int fill(int[][] land, int i, int j){

    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{i,j});
    int rst = 0;
    while(!q.isEmpty()){
      int[] pos = q.poll();
//       System.out.println("current fill pos "+pos[0]+", "+pos[1]);
       if(land[pos[0]][pos[1]] == 0){
         land[pos[0]][pos[1]] = 1;
         rst++;
       }

      for(int dx = -1; dx <= 1; dx++){
        for(int dy = -1; dy <= 1; dy++){
          int x = pos[0] + dx;
          int y = pos[1] + dy;
          if(dx == 0 && dy==0) continue;
          // System.out.println("Processing pos "+x+", "+y);

          if(x >= 0 && x < land.length && y >=0 && y < land[0].length && land[x][y] == 0){
            System.out.println("current enqueue pos "+x+", "+y);

            q.offer(new int[]{x, y});
          }
        }
      }
    }
    return rst;
  }
}
