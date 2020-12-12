package com.leetcode.s307;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution{
    int[] freq = null;
    int[] sum = null;
    int n = 0; 
    public List<Integer> countSmaller(int[] nums) {
        // calculate the rank of each number
        int id = 0; 
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), i);
        }
        // 
        n = list.size();
        freq = new int[n];
        sum = new int[n+1];
        
        List<Integer> rst = new ArrayList<>();
        for(int i = nums.length -1; i >= 0; i--){
            // calculate the freq of rank
            int rank = map.get(nums[i]);
            update(rank, 1);
            rst.add(getRange(rank));
            // get the freq of current rank
        }
        Collections.reverse(rst);
        return rst;
    }

    private int getRange(int x){
        int rst = 0; 
        while(x > 0){
            rst += sum[x];
            x -= lowbit(x);
        }
        return rst;
    }
    private void update(int index, int delta){
        freq[index] += delta;
        index = index + 1; 
        while( index <= n){
            sum[index] += delta;
            index += lowbit(index);
        }
    }
    private int lowbit(int x){
        return x&(-x);
    }
}