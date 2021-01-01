package com.leetcode.s44;

class Solution {
  int[][] dp = null;
  public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "acdcb";
    String p = "a*c?b";
    s ="";
    p = "*?";

    System.out.println(solution.isMatch(s,p));
  }
  public boolean isMatch(String s, String p) {
    boolean[][] dp = new boolean[s.length()+1][p.length()+1];
    // initialize
    dp[0][0] = true;
    for(int i = 1; i < p.length(); i++) {
    	if(p.charAt(i-1) == '*') {
    		dp[0][i] = true;
    	}
    	else {
    		break;
    	}
    }
    for(int i = 1; i <= s.length(); i++) {
    	for(int j = 1; j <= p.length(); j++) {
    		if(p.charAt(j-1) == '*') {
    			dp[i][j] = dp[i][j-1] || dp[i-1][j];
    		}
    		else if(p.charAt(j-1) == '?' || s.charAt(i-1) == p.charAt(j-1)){
    			dp[i][j] = dp[i-1][j-1];
    		}
    	}
    }
    return dp[s.length()][p.length()];
   // dp[0][i] empty string can match * only. 
    // dp[i][0] empty pattern can only match empty string
    
    
  }
/*
  private boolean isMatch(String s, int i, String p, int j){
	  
	  System.out.println("i="+i+"; j="+j);
	    if(dp[i][j] != 0){
	      return dp[i][j] == 1;
	    }
	    
    boolean rst = false;
    
    if(i >= s.length()) {
    	if(p.charAt(j) == '*') {
    		dp[i][j] = 1;
    	}
    	else {
    		dp[i][j] = 2;
    	}
    	return dp[i][j] == 1;
    }
    if( j >= p.length()){
      return i == s.length();
    }
    


    if(p.charAt(j) == '*'){
      rst = rst|| isMatch(s, i, p, j+1) || isMatch(s,i+1, p, j) || isMatch(s,i+1, p, j+1);
    }
    else if( ( p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))){
      rst = rst|| isMatch(s,i+1,p, j+1);
    }

    dp[i][j] = rst?1:2; // if rst is true, set it to 1, otherwise set it to 2;
    return rst;
  }
  */
}
