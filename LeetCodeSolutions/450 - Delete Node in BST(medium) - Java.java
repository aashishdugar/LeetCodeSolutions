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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
                return null;
        
        if(root.val==key){
                if(isLeaf(root)){
                      return null;
                }
                else if(hasOnlyLeft(root)){
                        root=root.left;
                }
                else if(hasOnlyRight(root))
                        root=root.right;
                else{
                        if(isLeaf(root.left)||hasOnlyLeft(root.left)){
                                root.val=root.left.val;
                                root.left=root.left.left;//
                        }
                        else{TreeNode slow=root.left;
                            TreeNode fast=slow.right;
                            while(fast.right!=null){
                              slow=fast;
                                    fast=fast.right;
                            }
                             root.val=fast.val;
                             slow.right=fast.left;
                            }
                }
        }
            else{
                   if(root.val>key){
                           root.left=deleteNode(root.left,key);
                   }
                    else{root.right=deleteNode(root.right,key);}
            }
            return root;
            
    }
        public boolean hasOnlyLeft(TreeNode node){
                return (node.left!=null&&node.right==null);
                        
        }
         public boolean hasOnlyRight(TreeNode node){
                return (node.left==null&&node.right!=null);
                        
        }
        public boolean isLeaf(TreeNode node){
                return (node.left==null&&node.right==null);
                        
        }       
}