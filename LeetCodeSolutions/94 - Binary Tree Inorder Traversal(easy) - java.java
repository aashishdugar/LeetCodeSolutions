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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return iot(root,res);
    }
    
    public List<Integer> iot(TreeNode root,List<Integer> res) {
        if(root == null) return res;
        iot(root.left,res);
        res.add(root.val);
        iot(root.right,res);
        
        return res;
    }
}














