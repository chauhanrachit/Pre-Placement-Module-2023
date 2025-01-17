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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)  return false; 
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if(curr.val == targetSum && curr.left==null && curr.right==null)    return true;
            if(curr.left!=null) {
                curr.left.val += curr.val;
                stack.push(curr.left);
            }
            if(curr.right!=null) {
                curr.right.val += curr.val;
                stack.push(curr.right);
            }
        }
        return false;
    }
}