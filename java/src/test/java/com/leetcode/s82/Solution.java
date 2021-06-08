package com.leetcode.s82;

   class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dumy = new ListNode();
        dumy.next = head;
        ListNode cur = head; 
        ListNode h = dumy; 
        while(cur.next != null){

            if(cur.val == cur.next.val){
                System.out.println(cur.val+" is duplicated node");
                h.next = pop(cur);
                cur = h.next;
                System.out.println("after popup h.next point to "+ h.next.val);
            }else{
                System.out.println(cur.val+" is NOT duplicated node");
                h.next = cur;
                cur = cur.next;
            }
        }
        return dumy.next; 
    }

    /*
    popup all the node with value == head.val
*/
private ListNode pop(ListNode head){
    int val = head.val;
    while(head != null && head.val == val){
        ListNode tmp = head.next; 
        head.next = null;
        head = tmp;
    }
    return head; 
}
}
