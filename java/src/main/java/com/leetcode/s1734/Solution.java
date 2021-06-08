package com.leetcode.s1734;

class Solution {
  public int[] decode(int[] encoded) {
    //encoded[i] = perm[i] XOR perm[i + 1]
    // encoded[i] ^ perm[i] = perm[i+1];

    int n = encoded.length + 1;

    int[] perm = new int[n];
    int total = 0;
    for(int i = 0; i <= n; i++){
      total = total^i;
    }
    int odd = 0;
    for(int i = 1; i < n; i=i+2){
      odd = odd^encoded[i];
    }

    perm[0] = odd^total;
    for(int i = 0; i < n-1; i++){
      perm[i+1] = encoded[i]^perm[i];
    }
    return perm;
  }
}