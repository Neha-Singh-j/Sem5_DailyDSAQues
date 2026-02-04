class Trie {

    class Node{
		char ch;
		boolean isTerminal;
		HashMap<Character,Node> child;
		Node(char ch){
			this.ch=ch;
			child=new HashMap<>();
		}
	}
	private Node root;
	public Trie(){
		root=new Node('*');
	}
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
		curr.isTerminal=true;
	}
	public boolean search(String word) {
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)){
				curr=curr.child.get(ch); //ch is present
			}else {
				return false;
			}
		}
		return curr.isTerminal; // end of the word or not 
	 }
	public boolean startsWith(String word) { //asking for prefix
		Node curr=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)){
				curr=curr.child.get(ch); //ch is present
			}else {
				return false;
			}
		}
		return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */