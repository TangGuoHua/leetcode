package com.leetcode.mst1614;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] bestLine(int[][] points) {
    int ans = 0;
    int[] rst = new int[2];
    for(int i = 0; i < points.length; i++){
      int[] p1 = points[i];
      Map<String, Integer> map = new HashMap<>();
      // store the number of points with same slop from p1.
      Map<String, Integer> mapp2 = new HashMap<>();
      // sloppy-> p2 information.

      for(int j = i+1; j < points.length; j++){
        int[] p2 = points[j];
        String slop = getslop(p1, p2);
        map.put(slop, map.getOrDefault(slop,0)+1);
        if(!mapp2.containsKey(slop)){
          // 某指定斜率的 第二个点
          mapp2.put(slop, j);

        }
        if(map.get(slop)> ans){
          ans = map.get(slop);
          rst[0] = i;
          rst[1] = mapp2.get(slop);
        }
      }
    }
    return rst;
  }

  private String getslop(int[] p1, int[] p2){
    int x1 = p1[0], x2=p2[0], y1 = p1[1], y2=p2[1];
    int dx = x2-x1;
    int dy = y2 - y1;
    int gcd = gcd(dx,dy);
    return String.valueOf((dx/gcd)+"/"+(dy/gcd));
  }
  private int gcd(int x, int y){
    if(y == 0){
      return x;
    }
    x = x%y;
    return gcd(y, x);
  }
}
