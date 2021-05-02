package com.leetcode.s403;

import java.util.HashSet;
import java.util.Set;


/**
 * 输入：stones = [0,1,3,5,6,8,12,17] 输出：true
 * <p>
 * <p>
 * 输入：stones = [0,1,2,3,4,8,9,11] 输出：false
 */
class Solution {

  public boolean canCross(int[] stones) {

    int n = stones.length;
    int lastStone = stones[n - 1];
    // where I can go from current position while pre step is k

    Set<Integer>[] dp = new HashSet[lastStone + 1];
    // 首先建立set 数组

    Set<Integer> firstStep = new HashSet<>();
    firstStep.add(1);
    // k = 1
    dp[1] = firstStep;
    // 每个元素存放的是上一步的步长

    for (int i = 1; i <= lastStone; i++) {

      // mark all the reachable steps from current step;
      if (dp[i] != null) {
        System.out.println("current position -> " + i + " is reachable");
        // current position is reachable
        Set<Integer> tmp = new HashSet<>(dp[i]);
        System.out.println(tmp);
        if (tmp.size() > 0) {
          for (int k : tmp) {
            // dp[i] is arraylist that store the length of previous step.

            for (int j = k - 1; j <= k + 1 && i+ j <= lastStone; j++) {
              if (dp[i + j] == null) {
                dp[i + j] = new HashSet<>();
              }
              dp[i + j].add(j);
            }

          }
        }

      }

    }
    return dp[lastStone] != null;

  }


}
