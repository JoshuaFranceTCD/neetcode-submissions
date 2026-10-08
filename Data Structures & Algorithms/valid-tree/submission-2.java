class Solution {
    public boolean validTree(int n, int[][] edges) {

        HashMap<Integer,List<Integer>> adj = new HashMap<>();
        for(int i = 0; i < n; i++){
            adj.put(i,new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        HashSet<Integer> visited = new HashSet<Integer>();
        if (!dfs(-1, 0, adj, visited)) {
            return false;
        }
        return visited.size() == n; // to check if the graph is connected
    }
    public boolean dfs(int parent,int node,HashMap<Integer,List<Integer>> adj, HashSet<Integer> visited){
        if(visited.contains(node)) return false;
        visited.add(node);
        for(int neighbour : adj.get(node)){
            if(neighbour == parent) continue;
            if(!dfs(node,neighbour,adj,visited)) return false;
        }
        return true;
    }
}
