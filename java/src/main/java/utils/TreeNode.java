package utils;

import java.util.ArrayList;
import java.util.List;

public class TreeNode{
     
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	TreeNode[] links = new TreeNode[26];
	public TreeNode get(int index) {
		return links[index];
	}
	public void set(int index) {
		links[index] = new TreeNode();
	}
    String word = null;
    
    public String toString() {
    	List<Character>  list = new ArrayList<>();
    	for(int i = 0; i < links.length; i++) {
    		if(links[i] != null) {
    			char c = (char)(i+'a');
    			list.add(c);
    		}
    	}
    	return list.toString()+"; word = "+this.word;
    }
    
}