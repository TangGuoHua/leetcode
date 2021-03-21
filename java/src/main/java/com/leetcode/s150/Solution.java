package com.leetcode.s150;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(isOprator(s)){
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if("+".equals(s)){
                    stack.push(String.valueOf(a+b));
                }
                else if("-".equals(s)){
                    stack.push(String.valueOf(a-b));
                }
                else if("*".equals(s)){
                    stack.push(String.valueOf(a*b));
                }
                else if("/".equals(s)){
                    stack.push(String.valueOf(a/b));
                }
            }
            else{
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private boolean isOprator(String s){
        if("+".equals(s) || "-".equals(s) ||"*".equals(s)||"/".equals(s)){
            return true;
        }
        return false;
    }
}
