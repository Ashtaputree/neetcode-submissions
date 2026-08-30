class PrefixTree {
    private static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean end = false;
    }

    private final TrieNode root;

    public PrefixTree() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.child[index] == null) {
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.end = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (curr.child[index] == null) {
                return false;
            }
            curr = curr.child[index];
        }
        return curr.end;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (curr.child[index] == null) {
                return false;
            }
            curr = curr.child[index];
        }
        return true;
    }
}
