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
    int nodeCount = 1;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        traverse(root);
        return nodeCount;
    }

    public void traverse(TreeNode root){
        if(root == null) return;
        if(root.left != null) nodeCount++;
        if(root.right != null) nodeCount++;
        traverse(root.left);
        traverse(root.right);
        return;
    }
}