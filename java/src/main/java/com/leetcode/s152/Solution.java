package com.leetcode.s152;

public class Solution {

	public int maxProduct(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}
		int max = 1, min = 1;
		int result = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int tempmax = Math.max(nums[i]*max, Math.max(nums[i], min*nums[i]));
			min = Math.min(nums[i]*min, Math.min(nums[i], nums[i]*max));
			max = tempmax;
			result = Math.max(tempmax, result);
		}
		return result;
	}
}
