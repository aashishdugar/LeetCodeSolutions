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
    public TreeNode sortedArrayToBST(int[] nums) {
        int h = nums.length - 1;
        TreeNode res = helper(nums,0,h);
        
        return res;
        
    }
    
    public TreeNode helper(int[] nums,int l,int h){
        if(l > h) {
            return null; 
        }
        int mid = (l + h)/2;
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left =  helper(nums,l,mid-1);
        temp.right  = helper(nums,mid+1,h);
        
        return temp;
    }
}