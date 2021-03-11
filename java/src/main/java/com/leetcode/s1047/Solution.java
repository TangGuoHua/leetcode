package com.leetcode.s1047;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution t = new Solution();
//		System.out.println(t.removeDuplicates("abbaca"));
//		System.out.println(t.removeDuplicates(""));
		System.out.println(t.removeDuplicates("aaa"));


	}
	
	public String removeDuplicates(String S) {
        Deque<Character> stack = new ArrayDeque<>(); 
        StringBuffer sb = new StringBuffer(); 

        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty() || S.charAt(i) != stack.peek()){
                stack.push(S.charAt(i));
            }
            else{
                char c = stack.pop();
                while(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                }
                while(i < S.length() && S.charAt(i) == c){
                    i++;
                }
                if(i == S.length() && stack.isEmpty()){
                    return sb.append(c).toString();
                }
                i--;
            }
        }
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

}
