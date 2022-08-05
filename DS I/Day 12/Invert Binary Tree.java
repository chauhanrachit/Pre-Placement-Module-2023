/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
    private static void swap(TreeNode current) {
        if (current == null) 
            return;
        swap(current.left);
        swap(current.right);
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
    }
}