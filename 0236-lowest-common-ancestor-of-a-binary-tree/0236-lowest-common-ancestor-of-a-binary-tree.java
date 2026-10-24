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

        return solution(root, p, q);
    }

    TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root;

        if(root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode x = solution(root.left, p, q);
        TreeNode y = solution(root.right, p, q);

        if(x != null && y!= null) return root;
        if(x == null) return y;
        else return x;
    }
}