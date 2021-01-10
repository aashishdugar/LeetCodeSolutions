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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        if (root == null) return res;
        if(root.left == null && root.right == null) {
            res.add(root.val + "");
            return res;
        }
        getPath(res,root.left,root.val +"");
        getPath(res,root.right,root.val+"");
        
        return res;
        
    }
    
    public void getPath(List<String> res,TreeNode root, String sofar){
        if(root == null) return;
        if(root.left == null && root.right ==null){
            res.add(sofar + "->" + root.val);
            return;
        }
        getPath(res,root.left,sofar+"->"+root.val);
        getPath(res,root.right,sofar+"->"+root.val);
    }
}
