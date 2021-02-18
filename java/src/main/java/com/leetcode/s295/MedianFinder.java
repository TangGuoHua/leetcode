package com.leetcode.s295;

import java.util.PriorityQueue;

public class MedianFinder {
	


    /** initialize your data structure here. */
    PriorityQueue<Integer> left = new PriorityQueue<Integer>((a,b)-> b - a);
    PriorityQueue<Integer> right = new PriorityQueue<Integer>((a,b)-> a - b);
    public MedianFinder() {

    }
    
    public void addNum(int num) {
        left.offer(num);
        if(left.size() > right.size()+1){
            right.offer(left.poll());
        }
    }
    
    public double findMedian() {
        if((left.size() + right.size())%2 == 0){
            return (left.peek()*1.0 + right.peek()*1.0)/2.0;
        }
        else{
            return left.peek()*1.0;
        }
    }
    
   
}
