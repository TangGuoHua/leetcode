package com.leetcode.s227;

import java.util.Stack;

class Solution {
    
    
    public int calculate(String s) {
        System.out.println("待计算字符串 ： "+s);
        // scan from left to right check each character
        int num = 0;
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        
        Stack<Character> stack2 = new Stack<>();
        stack2.push('*');
        
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println("当前处理的字符是 ： "+ c);
            // if it is oprand, accumulate it the get the number
            if(Character.isDigit(c)){
                num += num*10 + (c - '0');
            }
            else if(c == '+' || c== '-' || c == '*' || c == '/'){
                System.out.println("当前得到一个数字 ： "+num);
                stack1.push(num);
                num = 0; 
                if(!stack1.isEmpty() && (stack2.peek() == '*' || stack2.peek() == '/')){
                    // pop 2 numbers from stack1 and perform the calculation on sack2 top
                    // then push the result to stack1
                   calculate(stack1, stack2);
                    
                }
                
                stack2.push(c);
                System.out.println("此时stack1 = "+stack1.toString());
                System.out.println("此时stack2 = "+stack2.toString());

            }
            if(i == s.length() - 1) {
                stack1.push(num);
            }
        }
        while(!stack2.isEmpty()) {
            calculate(stack1, stack2);
        }
        return stack1.pop();
    }
    
    private void calculate(Stack<Integer> stack1, Stack<Character> stack2) {
        int a = stack1.pop();
        int b = stack1.pop(); 
        char c = stack2.pop();
        
        int result = 0; 
        if(c == '+') {
            result = a+b;
        }
        else if( c == '-') {
            result = a - b;
        }
        else if( c == '*') {
            result = a*b;
        }
        else {
            result = b/a;
        }
        System.out.println("弹出并计算 ： "+a+"  "+ c+ b+" = "+result);
       
        stack1.push(result);
    }
}




















