package com.leetcode.s7;

class Solution {

  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(reverse(1534236469));
  }
  public static int reverse(int x) {
    long num = 0;
    int i = 0;
    int sign = 1;
    if( x < 0){
      sign = -1;
      x = x * sign;
    }
    while( x > 0){
      i = x%10;
      num = num*10 + i;
      x = x/10;
      if(num > Integer.MAX_VALUE || num < Integer.MAX_VALUE)
      {
        return 0;
      }
    }
    return (int)num*sign;
  }
}