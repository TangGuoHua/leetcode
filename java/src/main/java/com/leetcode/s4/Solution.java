package com.leetcode.s4;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };

		System.out.println("nums1 = " + Arrays.toString(nums1));
		System.out.println("nums2 = " + Arrays.toString(nums2));
		System.out.println("Median=[" + new Solution().findMedianSortedArrays(nums1, nums2) + "]");
		// find a number mid of which there are half numbers less than it.
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	      
	      if(nums1.length > nums2.length){ // lest assume nums1 always shorter than nums2
	        int[] tmp = nums1;
	        nums1 = nums2;
	        nums2 = tmp;
	      }
	      int m = nums1.length, n = nums2.length; 
	      int k = (m + n)%2 == 0? (m + n)/2 : (m + n)/2 + 1;
	      int left = 0, right = m;
	      double result = 0.0;
	      
	      while(left <= right){
	        int i = left + (right - left)/2;
	        int j = k - i;
	        int leftmaxA = i == 0? Integer.MIN_VALUE:nums1[i-1];
	        int leftmaxB = j == 0? Integer.MIN_VALUE:nums2[j-1];
	        int rightminA = i == m? Integer.MAX_VALUE:nums1[i];
	        int rightminB = j == n? Integer.MAX_VALUE:nums2[j];

	        if(leftmaxA < rightminB){ 
	        	/*
	        	 * A[i - 1] < B[j] 
	        	 * 
	        	 * scenario 1: 
	        	 * B[j - 1] <= A[i] // this means we already found the result; 
	        	 * 
	        	 * scenario 2: 
	        	 * B[j - 1] > A[i] // this mean the A[i] is too small; 
	        	 * 
	        	 */
	        	if(leftmaxB < rightminA) {
	        		// this means we already found the result we stop process; 
	        		int median1 = Math.max(leftmaxA, leftmaxB);
	  	          	int median2 = Math.min(rightminA, rightminB);
	  	           result = (m + n)%2 == 0? (median1 + median2)/2.0:median1*1.0;
	  	           break;
	        	}
	            left = left + 1;
	        }
	        else{
	          right = right - 1; 
	        }
	      }
	        return result;
	    }
}
