package com.leetcode.mst1707;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

  @Test
  public void test(){
    String[] names = new String[]{"John(15)","Jon(12)","Chris(13)","Kris(4)","Christopher(19)"};
    String[] synonyms = new String[]{"(Jon,John)","(John,Johnny)","(Chris,Kris)","(Chris,Christopher)"};
    assertEquals(new Solution().trulyMostPopular(names, synonyms).length,2);

  }

}