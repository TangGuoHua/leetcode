package com.leetcode.mst0205;

import com.leetcode.common.ListNode;
import com.leetcode.common.Utils;

public class Solution {
  static int carry = 0;
  static ListNode  rst = new ListNode(0);
  public static void main(String[] args) {

    ListNode h1 = new ListNode(6);
    ListNode h11 = new ListNode(1);
    ListNode h12 = new ListNode(7);
    h1.next = h11;
    h11.next = h12;

    ListNode h2 = new ListNode(2);
    ListNode h22 = new ListNode(9);
    ListNode h23 = new ListNode(5);
    h2.next = h22;
    h22.next = h23;


    ListNode ans = rst;
    dfs(h1, h2);
    if(carry != 0){
      ListNode last = new ListNode(carry);
      rst.next = last;
      rst = rst.next;
    }
    Utils.printList(ans.next);

  }



  private static void dfs(ListNode h1, ListNode h2){

    if(h1 == null && h2 == null){
      return ;
    }

    int a = h1== null? 0:h1.val;
    int b = h2 == null? 0: h2.val;

    ListNode node = new ListNode( (a+b+carry)%10);
    carry = (a+b+carry)/10;
    rst.next = node;
    rst = rst.next;
    if(h1 == null && h2 != null){
      dfs(h1, h2.next);

    }
    else if(h1 != null && h2 == null){
      dfs(h1.next, h2);
    }
    else{
      dfs(h1.next, h2.next);
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    return null;
  }
}
