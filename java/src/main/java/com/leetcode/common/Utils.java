package com.leetcode.common;

public class Utils {

    public static void printList(ListNode h){
      while(h != null){
        System.out.print(h.val+",");
        h = h.next;
      }
    }
}
