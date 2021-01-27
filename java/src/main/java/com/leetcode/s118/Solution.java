package com.leetcode.s118;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		Solution t = new Solution();
		
		List<String> wordDict = new ArrayList<>();
		wordDict.add("cats");
		wordDict.add("dog");
		wordDict.add("sand");
		wordDict.add("and");
		wordDict.add("cat");
		
		;
		System.out.println(t.wordBreak("catsanddog", wordDict));
	}
	
	int n = 0; 
    Set<String> dict = new HashSet<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        n = s.length();
        for(String word : wordDict){
            dict.add(word);
        }
        return wordBreak(s, 0, "");
    }

    public List<String> wordBreak(String s, int start, String cur){
        List<String> result = new ArrayList<>();

        if(start >= n){
            result.add(cur);
            return result;
        }

        for(int i = start+1; i <= n; i++){
            String head = s.substring(start, i);
            if(dict.contains(head)){
            	if(cur.length() > 0) head = " "+head;
                wordBreak(s, i, cur+head);
            }
        }
        return result;
    }
}