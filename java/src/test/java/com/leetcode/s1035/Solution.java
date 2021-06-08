package com.leetcode.s1035;

class Solution {

  public int maxUncrossedLines(int[] nums1, int[] nums2) {

    int m = nums1.length;
    int n = nums2.length;
    int[][] dp = new int[m][n];

    dp[0][0] = nums1[0] == nums2[0] ? 1 : 0;
    for (int j = 1; j < n; j++) {
      dp[0][j] = nums1[0] == nums2[j] ? 1 : dp[0][j - 1];
    }

    for (int i = 1; i < m; i++) {
      dp[i][0] = nums2[0] == nums1[i] ? 1 : dp[i - 1][0];
    }

    int ans = dp[0][0];
    for (int i = 1; i < m; i++) {

      for (int j = 1; j < n; j++) {
        dp[i][j] = nums1[i] == nums2[j] ? dp[i - 1][j - 1] + 1
            : Math.max(dp[i - 1][j - 1], Math.max(dp[i - 1][j], dp[i][j - 1]));
        ans = Math.max(ans, dp[i][j]);
      }

    }

    return ans;
  }
}
