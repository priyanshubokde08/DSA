/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public void serialize(TreeNode root, StringBuilder sb) {
        if(root == null){
            sb.append("1001+");
            return;
        }
        
        sb.append(root.val).append("+");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }
    public String serialize(TreeNode root){
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    // Decodes your encoded data to tree.
    int idx = 0;
    public TreeNode build(String arr[]){
        if(arr[idx].equals("1001")){
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[idx++]));
        root.left = build(arr);
        root.right = build(arr);
        
        return root;
    }
    public TreeNode deserialize(String s) {
        String arr[] = s.split("\\+");
        idx = 0;
        return build(arr);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));