package com.leetcode.s57;


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


  public int[][] insert(int[][] intervals, int[] newInterval) {
	  int start = binarySearch(intervals, newInterval[0]);
	  int end = binarySearch(intervals, newInterval[1]);
	  if(start < 0) {
		  start = -start -1;
	  }
	  if(end < 0) {
		  end = -end - 1; 
	  }
	  int n = intervals.length;
	  boolean merged = false;
	  List<int[]> tempList = new ArrayList<>(); 
	  for(int i = 0; i < n; i++) {
		  if(i < start && i < n) {
			  tempList.add(intervals[i]);
		  }
		  else if(i >= start && i <= end){
			  newInterval[0] = Math.max(newInterval[0], intervals[i][0]);
			  newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
		  }
		  else {
			  merged = true;
			  tempList.add(newInterval);
			  tempList.add(intervals[i]);
		  }
	  }
	  if(!merged) {
		  tempList.add(newInterval);
	  }
	  
	  return toArray(tempList);
  }

  private int[][] toArray(List<int[]> list){
	  int[][] result = new int[list.size()][2];
	  for(int i = 0; i < list.size(); i++) {
		  result[i] = list.get(i);
	  }
	  return result;
  }
  private int binarySearch(int[][] intervals , int target){
    int low = 0;
    int high = intervals.length - 1;
    while(low <= high){
      int mid = (low + high)>>>1;
      if(between(target , intervals[mid][0], intervals[mid][1])){
        return mid;
      }
      else if(target < intervals[mid][0]){
        low = mid + 1;
      }
      else{
        high = mid - 1;
      }
    }
    return -low - 1;
  }
  private boolean between(int a, int left, int right){
    if(a>= left && a <= right){
      return true;
    }
    return false;
  }



}
//leetcode submit region end(Prohibit modification and deletion)

