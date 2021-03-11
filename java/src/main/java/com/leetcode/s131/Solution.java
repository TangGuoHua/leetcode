package com.leetcode.s131;

import java.util.ArrayList;
import java.util.List;
import utils.ArrayUtils;

public class Solution {

  public static void main(String[] args) {
    String s = "aba";
    Solution t = new Solution();
    List<List<String>> rst = t.partition(s);
    for (List<String> item : rst) {
      System.out.println(item);
    }
  }

  public List<List<String>> partition(String s) {
      boolean[][] dp = null;
      dp = preProcess(dp, s);
      List<String> path = new ArrayList<>(); 
      List<List<String>> result = new ArrayList<>(); 

      dfs(dp, 0,s, path, result);
      return result;
  }
  private void dfs(boolean[][] dp, int start, String s, List<String> path, List<List<String>> result){
      // if from start to curren poistion is parlindrom , set start to current position, 
      // recursively call the dfs
      // if remain s is empty, we found an answer. 
      if(start >= s.length() ){
          List<String> tmp = new ArrayList<>(); 
          tmp.addAll(path);
          result.add(tmp);
          return;
      }
      for(int i = start; i < s.length(); i++){
          if(dp[start][i]){ // from start to current position is palindrom 
              path.add(s.substring(start, i+ 1));
              dfs(dp, i + 1, s, path, result );
              path.remove(path.size() -1);
          }
      }

  }
  private boolean[][] preProcess(boolean[][] dp , String s){
      int n = s.length(); 
      dp = new boolean[n][n];
      for(int i = 0; i < n; i++){
          dp[i][i] = true;
          if(i < n - 1){
              if(s.charAt(i) == s.charAt(i + 1)){
                  dp[i][i+1] = true;
              }
          }
      }
      for(int len = 2; len < n; len++){
          for(int i = 0; i+len < n; i++){
              int j = i + len;
              dp[i][j] = dp[i+1][j-1] && s.charAt(i) == s.charAt(j);
          }
      }
      return dp; 
  }

}
