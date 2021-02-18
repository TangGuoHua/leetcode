package com.leetcode.s341;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
	Deque<NestedInteger> stack = null;
	List<NestedInteger> list = null;
    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new ArrayDeque<>();
        list = nestedList;
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
    	
    	
    	if(!stack.isEmpty() || list.size() > 0) {
    		
    		if(stack.isEmpty()) {
    			fillStack(stack,list);
    		}
    		
    	}
    	return !stack.isEmpty();
    }
    
    private void fillStack(Deque<NestedInteger> stack, List<NestedInteger> list) {
    	if(list.size() == 0) return ;
    	
    	while(stack.isEmpty()) {
    		NestedInteger head = list.remove(0);
    		if(head.isInteger()) {
    			stack.push(head);
    		}
    		else if(head.getList().size() > 0){
    			flatten(head, stack);// flatten the NestedInteger and push to stack
    		}
    		else {
    			if(list.size() == 0) {
    				break;
    			}
    		}
    	}
    	
    }
    private void flatten(NestedInteger head, Deque<NestedInteger> stack) {
    	if(head.isInteger()) {
    		stack.offer(head);
    		return; 
    	}
    	for(int i = 0; i < head.getList().size(); i++) {
    		flatten(head.getList().get(i), stack);
    	}
    }
}
class NestedInteger{
	Integer val; 
	public int  getInteger() {
		return val;
	}
	public boolean isInteger() {
		return val != null;
	}
	public NestedInteger() {
		
	}
	public NestedInteger(int i) {
		this.val = i;
	}
	List<NestedInteger> list = new ArrayList<>(); 
	public List<NestedInteger> getList(){
		return list;
	}
	
	public void add2List(NestedInteger e) {
			list.add(e);
	}
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
