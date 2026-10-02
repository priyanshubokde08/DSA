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
    public int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public boolean check(TreeNode root){
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        if((Math.abs(lh-rh)) > 1) return false;
        boolean l = check(root.left);
        boolean r = check(root.right);
        if(!l || !r) return false;
        return true;
    }
    public boolean isBalanced(TreeNode root) {
        return check(root);
    }
}