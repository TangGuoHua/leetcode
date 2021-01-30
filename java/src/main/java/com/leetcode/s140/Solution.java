package com.leetcode.s140;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	Map<String, List<String>> memo = new HashMap<>();
	int maxlen = 0;
	Set<String> dict = new HashSet<>();

	public List<String> wordBreak(String s, List<String> wordDict) {

		for (String word : wordDict) {
			dict.add(word);
			maxlen = Math.max(maxlen, word.length());
		}
		return helper(s, new ArrayList<>());
	}

	private List<String> helper(String s, List<String> path) {

		List<String> result = new ArrayList<>();
		if (memo.containsKey(s)) {
			return memo.get(s);
		}
		if ("".equals(s) || s.isEmpty()) {
//			result.add(String.join(" ", path));
			result.add("");
			return result;
		}

		for (int i = 1; i <= s.length(); i++) {
			String head = s.substring(0, i);
			if (dict.contains(head)) {
				path.add(head);
				List<String> subresult = helper(s.substring(i, s.length()), path);
				for (String subitem : subresult) {
					result.add(head + ("".equals(subitem)?"":" "+subitem));
				}
				path.remove(path.size() - 1);
			}
		}
		memo.put(s, result);
		return result;
	}

}
