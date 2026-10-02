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
        if(root == null){ ans.add("null"); return;}

        ans.add(String.valueOf(root.val));
        preorder(root.left, ans);
        preorder(root.right, ans); 
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();

    preorder(p, l1);
    preorder(q, l2);

    if(l1.size() != l2.size()) return false;
    
    for(int i = 0; i < l1.size(); i++){
        if(!l1.get(i).equals(l2.get(i))) return false;
    }
    return true;
    }
}