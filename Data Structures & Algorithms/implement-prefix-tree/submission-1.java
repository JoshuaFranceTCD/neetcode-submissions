class PrefixTree {

    public class TrieNode{
        public HashMap<Character, TrieNode> children = new HashMap<Character,TrieNode>();
        public boolean value = false;
    }
    public TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if(word.length() == 0) return;
        insert(root, word,0);
    }
    private void insert(TrieNode node, String word, int i){
        if(i >= word.length() ){
            node.value = true;
            return;
        }

        char cur = word.charAt(i);
        if(!node.children.containsKey(cur)){
            node.children.put(cur,new TrieNode());
        }
        insert(node.children.get(cur),word, i + 1);
      

    }

    public boolean search(String word) {
        if(word.length() == 0) return false;
        return search(root,word, 0);

    }
    public boolean search(TrieNode node, String word, int i ){
        if(i >= word.length()) {
            if(node.value) return true;
            return false;
        }
        if(node.children.containsKey(word.charAt(i))){
            return search(node.children.get(word.charAt(i)), word, i + 1);
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        if(prefix.length() == 0) return false;
        return startswith(root,prefix, 0);
    }

    public boolean startswith(TrieNode node, String word, int i ){
    if(i >= word.length()) {
        return true;
    }
    if(node.children.containsKey(word.charAt(i))){
        return startswith(node.children.get(word.charAt(i)), word, i + 1);
    }
    return false;
    }
    
}
