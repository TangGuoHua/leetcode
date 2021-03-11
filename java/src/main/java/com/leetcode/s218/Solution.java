package com.leetcode.s218;

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        // 1. 求左半部分的天际线
        // 2. 求右半部分的天际线
        // 3. 合并左右两部分的天际线
    	List<List<Integer>> result = getSkyline( buildings, 0, buildings.length);
    	for(List<Integer> item : result) {
    		System.out.println(item);
    	}
        return result;
    }

    /**
    * buildings : the skylines of the buildings that to be calculated
    * from : the from building included.
    * to : the to building excluded.
    */
    public List<List<Integer>> getSkyline(int[][] buildings, int from, int to){
        List<List<Integer>> result = new ArrayList<>();
        if(from >= to){
            return result;
        }
        if(to - from == 1){ // this means there is only one building
            // [lefti, righti, heighti]
            // add left up dot
            result.add(new ArrayList<>(){{add(buildings[from][0]);add(buildings[from][2]);}});
            // add right botton dot
            result.add(new ArrayList<>(){{add(buildings[from][1]);add(0);}});
            return result;
        }
        int mid = from+(to-from)/2;
        List<List<Integer>> leftSkylines = getSkyline(buildings, from, mid);
        List<List<Integer>> rightSkylines = getSkyline(buildings, mid, to);
        return mergeSkyline(leftSkylines, rightSkylines);
    }

    /**
    */
    private List<List<Integer>> mergeSkyline(List<List<Integer>> leftSkylines, List<List<Integer>> rightSkylines){
        List<List<Integer>> result = new ArrayList<>();
        int nL = leftSkylines.size();
        int nR = rightSkylines.size();
        int pL = 0, pR = 0, currY = 0, leftY = 0, rightY = 0;
        int x = 0, y = 0; 
        while(pL < nL && pR < nR){
            if(leftSkylines.get(pL).get(0) < rightSkylines.get(pR).get(0)){
                // 取最左边的一栋楼 
                leftY = leftSkylines.get(pL).get(1); // 左边楼的高度
                y = Math.max(leftY, rightY);
                x = leftSkylines.get(pL).get(0);
                pL++;
            }
            else{
                rightY = rightSkylines.get(pR).get(1);
                x = rightSkylines.get(pR).get(0);
                y = Math.max(leftY, rightY);
                pR++;
            }
            
            if(currY != y){
                updateResult(result, x, y);
            }
            currY = y;
        }
        if(pL < nL){
            appendResult(result, pL, leftSkylines);
        }
        if(pR < nR){
            appendResult(result, pR, rightSkylines);
        }
        return result;
    }

    private void updateResult(List<List<Integer>> result, int x, int y){
        if(result.size() == 0){
            result.add(new ArrayList<Integer>(){/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

			{add(x);add(y);}});
            return ;
        }
        List<Integer> last = result.get(result.size() -1 );
        int currX = last.get(0);
        if(currX == x){ // is vertical
            last.set(1, y);
        }
        else {
             result.add(new ArrayList<Integer>(){/**
				 * 
				 */
				private static final long serialVersionUID = -1327425882143817861L;

			{add(x);add(y);}});
        }
    }

    private void appendResult(List<List<Integer>> result,int from, List<List<Integer>> skylines){
        for(int i = from; i < skylines.size(); i++){
//            result.add(skylines.get(i));
        	int x = skylines.get(i).get(0);
        	int y = skylines.get(i).get(1);
        	int currY = result.get(result.size() - 1).get(1);
        	if(currY != y) {
        		updateResult(result, x, y);
        		currY = y; 
        	}
        }
    }
}