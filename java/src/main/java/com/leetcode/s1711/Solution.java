package com.leetcode.s1711;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countPairs(int[] deliciousness) {

        int answer = 0; 
        int mod = 1000000007;
        Arrays.sort(deliciousness);
        Map<Integer, Integer> map  = new HashMap<>(); 
        System.out.println(Arrays.toString(deliciousness));
        for(int num : deliciousness){
            System.out.println("当前处理 "+num);
            for(int powerOfTwo = 1;  powerOfTwo <= (int)Math.pow(2,21); powerOfTwo = powerOfTwo*2){
                if(powerOfTwo >= num && map.containsKey(powerOfTwo - num)){
                    System.out.println("找到两个数 "+ num+" + "+(powerOfTwo-num )+"="+ powerOfTwo);
                    answer += map.get((powerOfTwo - num));
                    answer %= mod;
                }
                
            }
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return answer; 

    }
}