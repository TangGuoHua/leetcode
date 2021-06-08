package com.leetcode.mst1713;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        Solution t = new Solution(); 
        File data = new File("/Users/c5316753/Develop/leetcode/leetcode/java/src/main/java/com/leetcode/mst1713/data.txt");
        Scanner sc = new Scanner(data);
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        System.out.println("Dict = "+Arrays.toString( s1.split(" ")));
//        System.out.println("s2 = "+ s2);
        t.respace(s1.split("\",\""), s2);
       
    }
    
    public int respace(String[] dictionary, String s) {
        System.out.println("s = "+s);
        if(s == null || s.length() == 0){
            return 0; 
        }
        int n = s.length(); 
        Set<String> dict = new HashSet<>(); 
        int maxWordLenth = 0; 
        int dp[] = new int[n+1];
        for(String word : dictionary){
            dict.add(word);
//            System.out.println("word : "+word);
//            if(s.indexOf(word) != -1) {
//                System.out.println("found word : "+word);
//            }
            if(word.length() > maxWordLenth){
                maxWordLenth = word.length();
            }
        }
        dp[0] = 0; 
        for(int i = 1; i <= s.length(); i++){
            boolean tailIndict = false;
            int j = 1  ;
            for( ;i - j >= 0 ; j++){
                if(i - j >= 0 && dict.contains(s.substring(i-j, i))){
                    tailIndict = true;
                      System.out.println(s.substring(i - j,i) + " 找到单词");
                    System.out.println("dp[i-j]= "+ dp[i-j]);
                    System.out.println("dp[i-1]= "+ dp[i-1]);
                    System.out.println("i ="+i);
                    System.out.println( "j =" +j);
                      dp[i] = Math.min(dp[i-j], dp[i-1]);
                      System.out.println("dp[i -j] =" + dp[i-j]);

                    System.out.println("dp["+i+"] =" + dp[i]);
                    System.out.println("i="+i+";  dp = "+Arrays.toString(dp));

                }
            }
            if(!tailIndict){
//                System.out.println(s.substring(0,i) + " 尾巴不在字典中");
                dp[i] = dp[i-1]+1;
            }
        }
        return dp[n];
    }

}
