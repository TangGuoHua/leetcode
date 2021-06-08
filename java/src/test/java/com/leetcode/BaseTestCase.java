package com.leetcode;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;

public class BaseTestCase extends TestCase {
  Logger log = Logger.getLogger(this.getClass().getName());
  protected <T> boolean assertEqualArray( List<T> expected, List<T> actual){
    if(expected.size() != actual.size()) {
      System.out.println("expected"+expected);
      System.out.println("actual"+actual);
      fail();
    }
    for(int i = 0; i < expected.size(); i++){
       if(!expected.get(i).equals(actual.get(i))){
         System.out.println("expected"+expected);
         System.out.println("actual"+actual);
         fail();
       }
    }
    return true;
  }
}
