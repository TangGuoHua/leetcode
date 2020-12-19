package utils;

import java.util.Arrays;

public class ArrayUtils {
    public  static void print2DArray(int[][] matrix){
      for(int[] arr : matrix){
        System.out.println(Arrays.toString(arr));
      }
    }
   public  static void print2DArray(boolean[][] matrix){
    for(boolean[] arr : matrix){
      System.out.println(Arrays.toString(arr));
    }
  }
}
