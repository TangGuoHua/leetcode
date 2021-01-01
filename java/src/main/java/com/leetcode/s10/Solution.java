package com.leetcode.s10;

public class Solution {
	
	public static void main(String[] args) {
		Solution sl = new Solution();
		String s = "ab";
		String p = ".*";
		s="as";
		p="a.*s";
		System.out.println(sl.isMatch(s, p));
	}
	
	boolean[][] dp = null;
    public boolean isMatch(String s, String p) {
    	int m = s.length();
    	int n = p.length();
    	dp = new boolean[m+1][n+1];
    	// initialize dp
    	dp[0][0] = true;
    	for(int j = 1; j <= p.length(); j++) {
    		dp[0][j] = p.charAt(j-1)=='*'&&dp[0][j-2];
    	}
    	// dp[i][0] if j is empty.
//    	for(int i = 1; i < s.length(); i++) {
//    		dp[i][0] = false; // only dp[i][0] = true only when i = 0; so this code block is not nacessary. 
//    	}
        isMatch(s.toCharArray(), m, p.toCharArray(), n);
        return dp[m][n];
    }
    private boolean isMatch(char[] s, int i, char[] p, int j) {
    	
    	if(i <= 0) {
    		return dp[0][j];
    	}
    	if(j <= 0) {
    		return dp[i][j];
    	}
    	boolean rst = false;
    	if(i > 0 && j > 0) {
    		if(p[j-1] == '*') {
        		rst = isMatch(s,i,p,j-2); // match nothing.
        		if(p[j-2] == s[i-1] || p[j-2] == '.') {
        			rst = rst || isMatch(s,i-1, p, j-2) || isMatch(s,i-1, p, j);
        		}
        	}
        	if(p[j-1] == '.' || p[j-1] == s[i-1]) {
        		rst = isMatch(s, i-1, p, j-1);
        	}
    	}
    	if(rst) {
    		dp[i][j] = true;
    	}
    	return rst;
    }
}
