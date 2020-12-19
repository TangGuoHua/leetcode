package com.leetcode.s301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  List<String> result = new ArrayList<>();
  Set<String> set = new HashSet<>();
  public static void main(String[] args) {
    Solution solution = new Solution();
    String src = "()())()";
    List<String> answer = solution.removeInvalidParentheses(src);
  }

  public List<String> removeInvalidParentheses(String s) {

    dfs("", s, 0, 0);

    return result;

  }

  private void dfs(String cur, String src, int flag, int start) {

    if (start >= src.length()) { // 搜索到最后位置， 结束搜索
      if(flag == 0){ // 如果此时的结果是合法的。
        add2Resut(result, set, cur);
      }
      return;
    }

    if(flag >=0) { // flag >= 0
      if (flag == 0) { // this is a valid case.
        add2Resut(result, set, cur);
      }
      dfs(cur, src, flag, start + 1);
      if(src.charAt(start) == '('){
        dfs(cur + src.charAt(start), src, flag +1 , start + 1); // 包含下一个右括号，继续往下搜索。

      }
      else{
        dfs(cur + src.charAt(start), src, flag -1, start + 1); // 包含下一个左括号，继续往下搜索。
      }

      // 不包含下一个字符，继续往下搜索。

    }
  }

  private void add2Resut(List<String> result, Set<String> set, String cur){
    while(result.size() >0 && result.get(result.size() -1).length() < cur.length()){
      result.remove(result.size()-1);
    }
    if(result.size() == 0 || result.get(result.size() -1).length() == cur.length() && cur.length() > 0){
       if(!set.contains(cur)) {
         result.add(cur);
         set.add(cur);
       }
    }
  }
/*
        scan from the first valid character
        String cur; // store the current string we hit.
        int flag ; // when hit '('  flag++; when hit ')' flag--;   anytime if the flag < 0 means the cur string is not a valid parenthese.

        for instance :

        => ()())
                ()()
                (())



*/
}
