package com.leetcode.s146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1,1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
		cache.put(4,4);
		System.out.println(cache.get(1));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));

	}
	int size = 0; 
	int capacity = 0; 
	Node head = new Node(-1,-1);
	Node tail = new Node(-1,-1);
	Map<Integer, Node> map = new HashMap<>(); 
    public LRUCache(int capacity) {
    	this.capacity = capacity; 
    	head.next = tail;
    	tail.pre = head;
    }
    
    public int get(int key) {
    	if(map.containsKey(key)){
    		Node node = map.get(key);
    		move2head(node);
    		return node.val;
    	}
    	return -1; 
    }
    
    public void put(int key, int value) {
    	Node node = null;
    	if(map.containsKey(key)){
    		node = map.get(key);
    		node.val = value;
    		move2head(node);
    		
    	}
    	else{
    		node = new Node(key,value);
    		insertNode(node);
    		map.put(key, node);
    		size++;
    		if(size > capacity){
    			node = popTail();
    			map.remove(node.key);
    		}
    	}
    }

    private void insertNode(Node node){
    	node.next = head.next;
    	head.next.pre = node;
    	head.next = node;
    	node.pre = head;
    }

    private Node popTail(){
    	if(tail.pre != head){
    		Node node = tail.pre;
    		tail.pre = tail.pre.pre;
    		tail.pre.next = tail;
    		node.next = null;
    		node.pre = null;
    		return node; 
    	}
    	return null;
    }

    private void move2head(Node node){
    	Node n = deleteNode(node);
    	insertNode(n);
    }
    private Node deleteNode(Node node){
    	Node pre = node.pre;
    	Node next = node.next; 
    	pre.next = next;
    	next.pre = pre; 
    	node.pre = null;
    	node.next = null;;
    	return node;
    }
}

class Node{
	int val = 0;
	int key = 0; 
	Node pre = null;
	Node next = null;
	public Node(int key, int val){
		this.key = key;
		this.val = val;
	}

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
