// Last updated: 8/1/2025, 10:39:56 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        return LevelOrder(root);
    }
    public Node LevelOrder(Node root) {
			List<Node> curr=new ArrayList<>();
			curr.add(root); //addlast
			while(!curr.isEmpty()) {
				 List<Node> nextLvl = new ArrayList<>();
                 for(int i=0;i<curr.size();i++){
                    Node n=curr.get(i);
                    if(n==null) continue;
                 
                 if(i<curr.size()-1){
                    n.next=curr.get(i+1);
                 }

				if(n.left!=null) {
					nextLvl.add(n.left);
				}
				if(n.right!=null) {
					nextLvl.add(n.right);
				}
			}
			curr=nextLvl;
		}
    return root;
    }
}
