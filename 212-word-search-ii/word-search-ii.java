class Solution {
    static List<String> ll;
    public List<String> findWords(char[][] board, String[] words) {
        // in one search collect all words starts iwth char 0,0 of board in words
       ll=new ArrayList<>();
        Trie t=new Trie();
		for(String s : words) {
			t.insert(s);
		}
		for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(t.root.child.containsKey(board[i][j])){
                    t.Search(board,i,j,t.root);
                }
            }
        }
        return ll;
    }
    static class Trie{ //inner class ka object bna rhe ho ssliye aapko static bnana hoga
		class Node{
		char ch;
		String isTerminal;
		HashMap<Character,Node> child;
			public Node(char ch) {
				this.ch=ch;
				child=new HashMap<>();
			}
		}
		Node root=new Node('*'); // remove privste bcz node access required
		public void insert(String word) { //complexity of insert = length of word 
			Node curr=root;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(curr.child.containsKey(ch)){
					curr=curr.child.get(ch); //already there so just move current 
				}else {
					Node nn=new Node(ch); 
					curr.child.put(ch,nn);
					curr=nn;
				}
			}
			curr.isTerminal=word; 
		}
		public void Search(char[][]maze,int i ,int j, Node node){
            if(i>=maze.length || i<0 || j>=maze[0].length || j<0 || !node.child.containsKey(maze[i][j])){
                return;
            }
            char ch=maze[i][j];
            node=node.child.get(ch);
            if(node.isTerminal!=null){
                ll.add(node.isTerminal);
                node.isTerminal=null;
            }
            maze[i][j]='*';
            Search(maze,i+1,j,node);
            Search(maze,i,j+1,node);
            Search(maze,i-1,j,node);
            Search(maze,i,j-1,node);
            maze[i][j]=ch;
        }
		
	}
}