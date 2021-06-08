package com.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
    List<Integer> subList = list.subList(2,5);
    System.out.println(subList);
  }
}
