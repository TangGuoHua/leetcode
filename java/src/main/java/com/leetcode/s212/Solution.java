package com.leetcode.s212;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.TreeNode;

class Solution {
	
    TreeNode root = new TreeNode();
    int m = 0;
    int n = 0;
    int[][] dirs = new int[][] {{1,0},{-1,0},{0,-1},{0,1}};
    public static void main(String[] args) {
//        char[][] board = new char[][] {{'o','a','a','n'},
//        							   {'e','t','a','e'},
//        							   {'i','h','k','r'},
//        							   {'i','f','l','v'}};
//    	char[][] board = new char[][] {{'o'}};
    	char[][] board = new char[][] {{'a','b'}};
        String[] words = new String[] {"a","b"};
        Solution sl = new Solution();
        
        System.out.println(sl.findWords(board, words));
    }

    Set<String> result = new HashSet<>();
    public List<String> findWords(char[][] board, String[] words) {
        if(board == null || board.length == 0) {
            return new ArrayList<>(result);
        }
        /*
        1. build a Trie
        2. add all the words to the Trie

        3. scan from the current position of the board
            3.1 if the current char was in the current layer of the Trie
                // exit
                if the Trie node contains the current char was marked as end of word.
                add it to result. 

                -> dfs next chars of 4 directions
                    -> next char match any char of next layer of the Trie
                        dfs 
                    -> next char not match any chars in next layer of the Trie.

            3.2 if the current char was NOT in the root of the Trie
                continue;
        */
         
        for(String word : words){
            add(word);
        }
//        Utils.printTrie(root);
        m = board.length;
        n = board[0].length; 
        boolean[][] marked = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(root.get(board[i][j] - 'a') != null){
                    dfs(board, i, j,root, 1, marked);
                }
            }
        }
        return new ArrayList<>(result);

    }

    private void dfs(char[][] board, int i, int j, TreeNode root, int level, boolean[][] marked){
    	

        if( !marked[i][j] && validCord(i,j) && root != null && root.get(board[i][j] - 'a') != null){
        	marked[i][j] = true;
            if(root.get(board[i][j] - 'a').getWord() != null){
                result.add(root.get(board[i][j] - 'a').getWord());
            }
            for(int k = 0; k < 4; k++){
            	int[] d = dirs[k];
                int x = i + d[0];
                int y = j + d[1];
                if(validCord(x,y)  ){
                	
                    dfs(board, x, y, root.get(board[i][j] - 'a'), level+1,marked);
                }
                
            }
            marked[i][j] = false;
        }
    }

      
    private boolean validCord(int i, int j){
        if(i >= 0 && i < m && j >= 0 && j < n){
            return true;
        }
        return false;
    }
    private void add(String word){
        TreeNode cur = root; 
        
        for(int i = 0; i < word.length(); i++){
        	
            if(cur.get(word.charAt(i) - 'a') == null){
                cur.set(word.charAt(i) - 'a');
            } 
            cur = cur.get(word.charAt(i) - 'a');
        }
        cur.setWord(word);
        
    }
    
    

}

