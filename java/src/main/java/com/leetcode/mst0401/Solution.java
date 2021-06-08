package com.leetcode.mst0401;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
  public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
    Map<Integer, Set<Integer>> dag = new HashMap<>();
    for(int[] edge : graph){
      if(!dag.containsKey(edge[0])){
        dag.put(edge[0],new HashSet<>());
      }
      dag.get(edge[0]).add(edge[1]);
      dag.put(edge[0], dag.get(edge[0]));
    }

    return dfs(dag, start, target);
  }

  private boolean dfs(Map<Integer, Set<Integer>> dag, int start, int end){
    boolean rst = false;
    if(start == end){
      rst= true;
      return rst;
    }

    if(dag.containsKey(start)){
      for(int child : dag.get(start)){
        rst = rst ||dfs(dag, child, end);
      }
    }

    return rst;
  }

}
