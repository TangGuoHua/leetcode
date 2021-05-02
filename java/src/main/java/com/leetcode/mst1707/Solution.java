package com.leetcode.mst1707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public String[] trulyMostPopular(String[] names, String[] synonyms) {

    // this map store name of baby -> the number of babies with this name;
    Map<String,Integer> nameCountMap = new HashMap<>(names.length);

    for(String name : names){
      nameCountMap.put(name.substring(0,name.indexOf("(")), Integer.parseInt(name.substring(name.indexOf("(")+1, name.length() -1)));
    }

    for(String str : synonyms){

      String name1 = str.substring(1, str.indexOf(","));
      if(!nameCountMap.containsKey(name1)){
        nameCountMap.put(name1, 0);
      }
      String name2 = str.substring(str.indexOf(",")+1, str.length() -1);
      if(!nameCountMap.containsKey(name2)){
        nameCountMap.put(name2,0);
      }
    }

    System.out.println(nameCountMap);
    // give each name an id;
    List<Map.Entry<String, Integer>> nameList = new ArrayList<>(nameCountMap.entrySet());
    Map<String, Integer> name2id = new HashMap<>();
    for(int i = 0; i < nameList.size(); i++){
      name2id.put(nameList.get(i).getKey(), i);
    }
    System.out.println(name2id);

    // give an id to each name
    UF uf = new UF(nameList.size());

    // for each name, get the id and union them
    for(String str : synonyms){

      String name1 = str.substring(1, str.indexOf(","));
      String name2 = str.substring(str.indexOf(",")+1, str.length() -1);
      System.out.println("try to union "+name1 + " and "+name2);
      uf.union(name2id.get(name1), name2id.get(name2));
    }

    Map<Integer, List<Integer>> parentChildrenMap = new HashMap<>();
    for(int i = 0; i < nameList.size(); i++){
      int parent = uf.findParent(i);
      if(!parentChildrenMap.containsKey(parent)){
        parentChildrenMap.put(parent, new ArrayList<>());
      }
      parentChildrenMap.get(parent).add(i);
    }
    System.out.println(parentChildrenMap);

    String[] result = new String[parentChildrenMap.size()];
    int index = 0;
    for(Map.Entry<Integer, List<Integer>> entry : parentChildrenMap.entrySet()){

      List<String> children = new ArrayList<>();
      for(Integer childId : entry.getValue()){
        children.add(nameList.get(childId).getKey());
      }

      Collections.sort(children);
      int total = 0;
      for(String childName : children){
        total += nameCountMap.get(childName);
      }
      result[index++] = getName(children,nameCountMap)+"("+total+")";

    }
    return result;
  }
  private String getName(List<String> children, Map<String, Integer> map){
    for(int i = 0; i < children.size();i++){
      if(map.get(children.get(i))> 0){
        return children.get(i);
      }
    }
    return "";
  }
}

class UF{

  int n = 0;
  int[] parent = null;
  public UF(int n){
    this.n = n;
    parent = new int[n];
    for(int i = 0; i < parent.length; i++){
      parent[i] = i;
    }
  }

  public int findParent(int x){
    while(x != parent[x]){
      x = parent[x];
    }
    return x;
  }

  public boolean isInSameSet(int x, int y){
    int px = findParent(x);
    int py = findParent(y);
    return px == py;
  }
  public void union(int x, int y){
    int px = findParent(x);
    int py = findParent(y);
    if(px!=py){
      parent[py]=px;
    }
  }
}
