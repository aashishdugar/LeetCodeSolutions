/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preOrderTraversal(root,res);
        return res;
        
    }
    
    public List<Integer> preOrderTraversal(Node root, List<Integer> res){
        if (root == null) return res;
        res.add(root.val);
        for (Node x: root.children){
            preOrderTraversal(x,res);
        }
        return res;
            
    }
}