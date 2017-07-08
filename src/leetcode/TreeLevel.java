package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hkarachiwala on 3/11/17.
 */
public class TreeLevel {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
              val = x;
          }
      }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Queue<List<TreeNode>> queue = new LinkedList<List<TreeNode>>();
        List<TreeNode> start = new ArrayList<TreeNode>();
        start.add(root);
        queue.add(start);

        while(!queue.isEmpty()) {
            List<TreeNode> current = queue.poll();
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            List<Integer> res = new ArrayList<Integer>();
            for(TreeNode t : current) {
                res.add(t.val);
                if(t.left!=null) {
                    nextLevel.add(t.left);
                }
                if(t.right!=null) {
                    nextLevel.add(t.left);
                }
            }
            if(!nextLevel.isEmpty()) {
                queue.add(nextLevel);
            }
            result.add(res);
        }

        return result;

    }


}
