package com.leetcode.s132;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int result = 0; 
    public int minCut(String s) {
        if(s == null || s.length() == 0) {
            return result;
        }
        
        int n = s.length(); 
        result = n-1; 
        boolean[][] dp = null;
        dp = preProcess(dp, s);
        if(dp[0][n-1]) return 0; 

        dfs(dp, 0,  s, new ArrayList<String>());
        return result;
    }
    private void dfs(boolean[][] dp, int start, String s, List<String> path){
        if(start >= s.length() ){
            result = Math.min(path.size()-1, result);
            return;
        }
        for(int i = start + 1; i <= s.length(); i++){
            if(dp[start][i-1]){
                path.add(s.substring(start, i));
                dfs(dp, i, s, path);
                path.remove(path.size() -1);
            }
        }
    }
    private boolean[][] preProcess(boolean[][] dp , String s){
        int n = s.length(); 
         dp = new boolean[n][n]; 

        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            if(i < n -1 && s.charAt(i) == s.charAt(i + 1)){
                dp[i][i+1] = true;
            }
        }
        for(int len = 2; len < n; len++){
            for(int i = 0; i + len < n; i++){
                int j = i + len; 
                dp[i][j] = dp[i+1][j-1] && s.charAt(i) == s.charAt(j);
            }
        }
        return dp; 
    }
}
