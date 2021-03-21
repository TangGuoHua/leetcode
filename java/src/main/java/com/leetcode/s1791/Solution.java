package com.leetcode.s1791;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findCenter(int[][] edges) {

        int n = 100000;
        int[] outDegree = new int[n+1];
        int[] inDegree = new int[n+1]; 
        // key is from vertex 
        for(int[] item : edges){
            int from = item[0];
            int to = item[1]; 
            outDegree[from]++;
            inDegree[to]++;
        }
        for(int i = 1 ; i <= n; i++){
            if(outDegree[i] > 0 && inDegree[i] > 0){
                return i;
            }
        }
        return -1;

    }
}
