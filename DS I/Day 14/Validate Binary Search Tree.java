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
    int prev = Integer.MIN_VALUE - 10;
    boolean ans = true;
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(prev != Integer.MIN_VALUE - 10 && prev >= root.val){
            ans = false;
            return;
        }
        prev = root.val;
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return ans;
    }
}