package com.leetcode.s90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        int n = nums.length;
        int start = 0;
        
        while (start < n) {
            List<List<Integer>> list = new ArrayList<>();
            list.addAll(result);

//            if(start > 0 && nums[start] == nums[start - 1] ){
//                start++;
//                continue;
//            }

            for (List<Integer> item : list) {
                List<Integer> tmp = new ArrayList<>();
                
                tmp.addAll(item);
                tmp.add(nums[start]);
                result.add(tmp);
                
                System.out.println(tmp);

            }
            System.out.println("");
            start++;
//            System.out.println("start == "+start);
        }
        return result;
    }
}
