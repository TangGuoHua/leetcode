package com.leetcode.s324;

import java.util.Arrays;

public class Solution {
    public void wiggleSort(int[] nums) {

    	int n = nums.length;
    	int mid = n/2;
    	int pivot = findKthNumber(nums, mid);

    	partition(nums, 0, n - 1, pivot, 1);

    }

    
    public int findKthNumber(int[] nums, int k){

        int left = 0, right = nums.length - 1;
        for(int i = left; i <= right;){
        	int id = partition(nums, left, right, nums[left], 0);
        	if(id == k){
        		return nums[id];
        	}
        	else if( id < k){
        		left = id + 1;
        	}
        	else{
        		right = id - 1;
        	}
        }
        return nums[left];
    }

    private int getId(int strategy, int i, int n){
    	if(strategy == 0){
    		return i;
    	}
    	else{
    		return (1+2*i)%(n|1);
    	}
    }
    private int partition(int[] nums, int left, int right, int pivot, int strategy){
        int n = nums.length; 
        for(int i = left; i <= right;){
        	if(nums[getId(strategy, i, n)] > pivot){
        		swap(nums, getId(strategy, i++, n), getId(strategy, left++, n));
        	}
        	else if( nums[getId(strategy, i, n)] < pivot){
        		swap(nums, getId(strategy, i, n), getId(strategy, right--, n));
        	}
        	else{
        		i++;
        	}
        }
        return getId(strategy, left, n); 
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
    }
}

enum STRATEGY {
	VIRTUAL, ACTUAL
}