package com.leetcode.s629;

import com.leetcode.BaseTestCase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public class SolutionTest extends BaseTestCase {

  public void testTopKFrequent() {
    String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
    int k = 2;
    assertEqualArray(new ArrayList<>(Arrays.asList("i", "love")),
        new com.leetcode.s629.Solution().topKFrequent(words,k));
  }

public void testTopKFrequent2() {
    String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
    int k = 4;
    assertEqualArray(new ArrayList<>(Arrays.asList("the", "is", "sunny", "day")),
        new com.leetcode.s629.Solution().topKFrequent(words,k));
  }



}