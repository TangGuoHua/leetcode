package com.leetcode.s781;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int rst = 0; 
        for(int num : answers){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() != 0){
                int cnt = entry.getValue();
                while(cnt - entry.getKey() -1 > 0) {
                    rst += entry.getKey() +1;
                    cnt = cnt - entry.getKey() -1;
                }
                rst += (entry.getKey() +1);
            }
            else{
                rst += entry.getValue();
            }
        }
        return rst;
    }
}
