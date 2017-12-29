package leetcode;

public class BalancedTree {

    public static TreeNode buildTree(int[] arr, int start, int end) {
        if(end < start) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = buildTree(arr, start, mid-1);
        root.right = buildTree(arr, mid + 1, end);
        return root;
    }
}
