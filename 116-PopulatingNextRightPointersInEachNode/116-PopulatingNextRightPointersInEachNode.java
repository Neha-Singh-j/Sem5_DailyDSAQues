// Last updated: 8/1/2025, 10:40:00 PM
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
        if(root == null) return root;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
            
			while(!q.isEmpty()) { // q getting empty as its not founding more left or right nodes of leaf nodes

                int size=q.size();
				Node dummy=new Node(0);
                while(size-->0){
                    Node n=q.poll();
                    dummy.next=n;
                    dummy=dummy.next; // making result by adding one by one levvel order element to result and queue is growing then decreasing
                    if(n.left!=null) {
                        q.add(n.left);
                    }
                    if(n.right!=null) {
                        q.add(n.right);
                    }
			    }
            }
	    return root;
	}
}