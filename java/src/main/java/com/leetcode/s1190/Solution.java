package com.leetcode.s1190;

import java.util.ArrayDeque;

class Solution {
  public String reverseParentheses(String s) {

    if(s == null || s.length() < 1){
      return "";
    }
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for(int i = 0; i < s.length(); i++){

      char c = s.charAt(i);
      if(c == ')'){
        // pop the top of the stack until hit '(', reverse the popped string and push it back
        popAndReverse(stack);
      }
      else{

        stack.push(c);
      }
    }
    return getResult(stack);

  }

  private String getResult(ArrayDeque<Character> stack){
    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()){
      sb.append(stack.removeLast());
    }
    return sb.toString();
  }

  private void popAndReverse(ArrayDeque<Character> stack){

    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()){
      char c = stack.pop();
      if(c != '(' ){
        sb.append(c);
      }
      else{
        break;
      }
    }
    for(int i = 0; i < sb.length(); i++){
      stack.push(sb.charAt(i));
    }
  }

}
