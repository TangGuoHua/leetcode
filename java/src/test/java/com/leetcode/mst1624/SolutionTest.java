package com.leetcode.mst1624;

import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

  @Test
  public void test(){
    int[] nums = new int[]{5,6};
    int target = 11;
    List<List<Integer>> result = new com.leetcode.mst1624.Solution().pairSums(nums, target);
    result.forEach(item->{
      System.out.println(item);
    });

    assertEquals(result.size() , 1);


  }
  @Test
  public  void test2(){
    int[] nums = new int[]{6, 1, 7, 6, 5, 1, 0, 0, 5, -1};
    int target = 6;
    List<List<Integer>> result = new com.leetcode.mst1624.Solution().pairSums(nums, target);
    result.forEach(item->{
      System.out.println(item);
    });
    assertEquals( 5, result.size());
  }

}