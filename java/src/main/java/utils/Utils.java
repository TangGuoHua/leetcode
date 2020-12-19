
package utils;

import java.util.LinkedList;
import java.util.Queue;


public class Utils{
  public static void printTrie(TreeNode root){
    
    Queue<TreeNode> q = new LinkedList<>();

    q.offer(root);

    while(!q.isEmpty()){

      int size = q.size(); 

      for(int i = 0; i < size; i++){
        TreeNode cur = q.poll();
        System.out.println(cur);
        for(int j = 0; j < 26; j++){
          if(cur.get(j)!= null){
            q.offer(cur.get(j));
          }
        }
      }
      System.out.println("   ");
    }

  }
}