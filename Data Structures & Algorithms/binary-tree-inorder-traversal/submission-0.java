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
    public static ArrayList<Integer> l=new ArrayList<>();
    public static void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        l.clear();
        if(root==null)
        {
            return l;
        }
        inorder(root);
        return l;
        
    }
}