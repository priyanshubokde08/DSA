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
    public void preorder(TreeNode root, List<String> ans){
        if(root == null) {
            ans.add("null");
            return;
        }
        ans.add(String.valueOf(root.val));
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
    //Use mirror traversal because the right subtree must be compared in the opposite direction to the left subtree
    public void mirrorPreorder(TreeNode root, List<String> ans) {
        if(root == null) {
            ans.add("null");
            return;
        }

        ans.add(String.valueOf(root.val));
        mirrorPreorder(root.right, ans);
        mirrorPreorder(root.left, ans);
    }
    public boolean isSymmetric(TreeNode root) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        preorder(root.left, l1);
        mirrorPreorder(root.right, l2);

        for(int i = 0 ; i < l1.size(); i++){
            if(!l1.get(i).equals(l2.get(i))) return false;
        }
        return true;
    }
}