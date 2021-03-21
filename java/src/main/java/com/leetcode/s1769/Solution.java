package com.leetcode.s1769;

class Solution {
    public int[] minOperations(String boxes) {
        if(boxes == null || boxes.length() < 1){
            return new int[]{};
        }
        int[] nums = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++){
            if(boxes.charAt(i) =='1'){
                nums[i] = 1;
            }
        }
        int n = nums.length;
        int[] left2rightBalls = new int[n]; left2rightBalls[0] = nums[0];
        int[] right2leftBalls = new int[n]; right2leftBalls[n-1] = nums[n-1];
        int[] dpLeft2Right = new int[n]; dpLeft2Right[0] = 0;
        int[] dpRight2Left = new int[n]; dpRight2Left[n -1] = 0;

        for(int i = 1; i < n; i++){ // 从最左边到当前位置的，包含当前位置的球数。
            left2rightBalls[i] = nums[i] + left2rightBalls[i-1];
        }
        for(int i = n-2; i>=0; i--){ // 从最右边到当前位置，包含当前位置的球数。
            right2leftBalls[i] = nums[i] + right2leftBalls[i+1];
        }
        for(int i = 1; i < n; i++){ //把当前位置左边所有的球移动到当前位置所需的步数。
            dpLeft2Right[i] = left2rightBalls[i-1] + dpLeft2Right[i-1];
        }
        for(int i = n-2; i >=0; i--){ // 把当前位置右边的所有球移动的当前位置所需的步数。
            dpRight2Left[i] = dpRight2Left[i+1] + right2leftBalls[i+1];
        }
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = dpLeft2Right[i] + dpRight2Left[i];
        }
        return answer;
    }
}