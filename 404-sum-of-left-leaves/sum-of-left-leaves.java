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
    public int lefty(TreeNode root){
        int sum = 0;

        if(root == null) return 0;

        if(root.left != null && (root.left.left == null && root.left.right == null)) sum += root.left.val;

        sum += lefty(root.left);
        sum += lefty(root.right);

        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return lefty(root);
    }
}