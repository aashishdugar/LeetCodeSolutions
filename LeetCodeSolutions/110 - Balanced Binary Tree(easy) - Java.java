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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int l = height(root.left);
        int r = height(root.right);
        
        int diff = Math.abs(l-r);
        boolean res = false;
        if(diff == 0 || diff == 1) res = true;
        
        return res && isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    public int height(TreeNode node) {
        if (node == null) return 0;
        
        int lef = height(node.left);
        int rig = height(node.right);
        
        return Math.max(lef,rig) + 1;
    }
}