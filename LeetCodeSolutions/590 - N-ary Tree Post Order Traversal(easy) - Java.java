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
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root,res);
        return res;
    
    }
    
    List<Integer> postOrder(Node root, List<Integer> res){
        if(root == null) return res;
        for(Node x:root.children){
            postOrder(x,res);
        }
        res.add(root.val);
        
        return res;
    }
}