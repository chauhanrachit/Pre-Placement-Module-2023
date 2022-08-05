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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> nextNodes = new LinkedList<>();
        nextNodes.add(root);
        while (!nextNodes.isEmpty()) {
            Queue<TreeNode> theseNodes = nextNodes;
            nextNodes = new LinkedList<>();
            List<Integer> thisRow = new ArrayList<>();
            for (TreeNode node : theseNodes) {
                if (node.left != null) nextNodes.add(node.left);
                if (node.right != null) nextNodes.add(node.right);
                thisRow.add(node.val);
            }
            l.add(thisRow);
        }
        return l;
    }
}