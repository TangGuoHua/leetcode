package com.leetcode.s149;

import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxPoints(int[][] points) {
    	
    	if(points == null) return 0; 
    	if(points.length <=2) return points.length;
    	int result = 2, dup = 1; 
    	Map<String, Integer>  map = new HashMap<>();
    	for(int i = 0; i < points.length; i++){
    		dup = 1;
    		map = new HashMap<>();
    		  // 表示以过points【i】 斜率为k的直线所经过的所有的点。 
    		for(int j = i + 1; j < points.length; j++){
    			int dx = points[j][0] - points[i][0];
    			int dy = points[j][1] - points[i][1];
    			if(dx == 0 && dy == 0){
    				dup++;
    				continue;
    			}

    			String k = getSlop(dx, dy);
    			map.put(k, map.getOrDefault(k,0)+1);
    			result = Math.max(result, map.get(k)+dup);
    		}
    		
    		result = Math.max(result, dup);
    		for(Map.Entry<String, Integer> entry : map.entrySet()){
        		result = Math.max(result, entry.getValue() + dup);
        	}
    	}
    	
    	return result; 
    }

    private String getSlop(int dx, int dy){
    	int d = gcd(dx, dy);
    	return String.valueOf(dy/d)+"/"+String.valueOf(dx/d);
    }

    private int gcd(int a, int b){
    	if(b == 0){
    		return a;
    	}
    	return gcd(b, a%b);
    }
}