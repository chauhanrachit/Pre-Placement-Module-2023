/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, p,q);
    }
    public TreeNode dfs(TreeNode curr, TreeNode p, TreeNode q){
        if(curr==null)
            return null;
        if(curr.val>p.val && curr.val>q.val)
            return dfs(curr.left, p, q);
        else if(curr.val<p.val && curr.val<q.val)
            return dfs(curr.right,p,q);
        else
            return curr;
    } 
}