package com.leetcode.s629;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Solution {
  public List<String> topKFrequent(String[] words, int k) {

    Map<String, Integer> cnt = new HashMap<>();
    for(String word : words){
      cnt.put(word, cnt.getOrDefault(word,0)+1);
    }

    List<Map.Entry<String, Integer>> list = new ArrayList<>();
    list.addAll(cnt.entrySet());

    list.sort(new Comparator<Entry<String, Integer>>() {
      @Override
      public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
      }
    });
    List<String> rst =  list.stream().map(item-> item.getKey()).collect(Collectors.toList()).subList(0,k);
    rst.sort(new Comparator<String>() {
      @Override
      public int compare(String word1, String word2) {
        return cnt.get(word1) == cnt.get(word2) ? word1.compareTo(word2) : cnt.get(word2) - cnt.get(word1);
      }


    });
    return rst;
  }



}
