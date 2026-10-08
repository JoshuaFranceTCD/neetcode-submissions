class WordDictionary {

    public class Node{
        public HashMap<Character, Node> children = new HashMap<Character,Node>();
        public boolean val = false;
    }

    public Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        if(word.length() == 0) return;
        addWord(root,word,0);
    }
    private void addWord(Node node, String word, int i){
        if(i >= word.length() ){
            node.val = true;
            return;
        }
        char c = word.charAt(i);
        if(!node.children.containsKey(c)){
            node.children.put(c,new Node());
        }
        addWord(node.children.get(c),word,i+1);
    }

    public boolean search(String word) {
        if(word.length() == 0) return false;
        return search(root, word,0);
    }
    private boolean search(Node node, String word, int i){
        if(i >= word.length()){
            if(node.val) return true;
            return false;
        }
        if(word.charAt(i) == '.' ){
            for(Node n: node.children.values()){
                if(search(n, word, i + 1)){
                    return true;
                }
            }
        }
        char c = word.charAt(i);
        
        if(node.children.containsKey(c)){
            return search(node.children.get(c),word,i + 1);
        }
        return false;

    }
}
