package com.leetcode.s88;

import java.util.Arrays;

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int ans_p = m + n -1; 
        int p1 = m - 1, p2 = n -1; 
        while( (p1 >= 0 || p2 >= 0) && ans_p >= 0){
            if(p1 < 0) {
                nums1[ans_p] = nums2[p2];
                p2--;
                ans_p--;
            }
            else if(p2 < 0) {
                nums1[ans_p] = nums1[p1];
                p1--;
                ans_p--;
            }
            else if(nums2[p2] >= nums1[p1]) {
                nums1[ans_p] = nums2[p2];
                p2--;
                ans_p--;
            }
            else {
                nums1[ans_p] = nums1[p1];
                p1--;
                ans_p--;
            }
        }
        System.out.println(Arrays.toString(nums1));
        return nums1;
    }
}
