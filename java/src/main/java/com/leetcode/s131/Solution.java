package com.leetcode.s131;

import java.util.ArrayList;
import java.util.List;
import utils.ArrayUtils;

public class Solution {

  public static void main(String[] args) {
    String s = "aab";
    Solution t = new Solution();
    List<List<String>> rst = t.partition(s);
    for (List<String> item : rst) {
      System.out.println(item);
    }
  }

  boolean[][] dp = null;

  public List<List<String>> partition(String s) {
    //backtracking

    List<List<String>> rst = new ArrayList<>();
    if (s == null || s.isEmpty()) {
      return rst;
    }
    int n = s.length();
    dp = new boolean[n][n];

    preprocess(dp, s);
    System.out.println("pre process of s");
    ArrayUtils.print2DArray(dp);
    dfs(s, 0, rst, new ArrayList<String>());
    return rst;
  }
  private void preprocess(boolean[][] dp , String s){
    int n = s.length();
    for(int i = 0; i < n; i++){
      dp[i][i] = true;
      if(i < n -1 && s.charAt(i) == s.charAt(i+1)){
        dp[i][i+1] = true;
      }
    }
    for(int len = 2; len < n; len++){
      for(int i = 0; i + len < n; i++){
        int j = i + len;
        if(dp[i+1][j-1] && s.charAt(i) == s.charAt(j)){
          dp[i][j] = true;
        }
      }
    }
  }
  private void dfs(String s, int start, List<List<String>> rst, List<String> cur) {

    if (start >= s.length()) { // if end of string is reachable.
      List<String> tmp = new ArrayList<>(cur);
      rst.add(tmp);
      return;
    }

    for (int i = start + 1; i <= s.length(); i++) {
      String head = s.substring(start, i);
      if (dp[start][i - 1]) {
        cur.add(s.substring(start, i));
        dfs(s, i, rst, cur);
        cur.remove(cur.size() - 1);
      }
    }

  }

  private boolean isValid(String s) {
    int i = 0, j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}
