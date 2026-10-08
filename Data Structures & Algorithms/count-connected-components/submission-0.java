class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i = 0; i < n; i++){
            adj.put(i,new ArrayList<Integer>());
        }
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        HashSet<Integer> visited = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(visited.contains(i)) continue;
            count++;
            dfs(i,adj,visited);
        }
        return count;

    }
    public void dfs(int n, HashMap<Integer,List<Integer>> adj, HashSet<Integer> visited){
        visited.add(n);
        for(int neighbour : adj.get(n)){
            if(visited.contains(neighbour)) continue;
            dfs(neighbour,adj,visited);
        }
    }
}
