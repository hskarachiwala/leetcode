import leetcode.BalancedTree;
import leetcode.TreeNode;

/**
 * Created by hkarachiwala on 3/8/17.
 */

public class Driver {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 11, 17};
        TreeNode root = BalancedTree.buildTree(arr, 0, arr.length-1);
        System.out.println(root);
    }
}
