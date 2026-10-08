/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public HashMap<Node,Node>  created = new HashMap<Node,Node>();            
    public Node cloneGraph(Node node) {

        if( node == null) return null;
        if(created.containsKey(node)){
            return created.get(node);
        }
        Node n = new Node(node.val);
        created.put(node,n);
        for(Node neighbor : node.neighbors){
            n.neighbors.add(cloneGraph(neighbor));
        }
        return n;


        
    }
}