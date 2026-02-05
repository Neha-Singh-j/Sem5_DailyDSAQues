class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Trie t = new Trie();
        for (String s : strs) {
            t.insert(s);
        }

        StringBuilder sb = new StringBuilder();
        Trie.Node curr = t.root;
        while (curr.child.size() == 1 && curr.isTerminal == null) {
            for (char ch : curr.child.keySet()) {
                sb.append(ch);
                curr = curr.child.get(ch);
            }
        }

        return sb.toString();
    }

    static class Trie {
        class Node {
            char ch;
            String isTerminal;
            HashMap<Character, Node> child;

            public Node(char ch) {
                this.ch = ch;
                child = new HashMap<>();
            }
        }

        private Node root = new Node('*');

        public void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!curr.child.containsKey(ch)) {
                    curr.child.put(ch, new Node(ch));
                }
                curr = curr.child.get(ch);
            }
            curr.isTerminal = word;
        }
    }
}
