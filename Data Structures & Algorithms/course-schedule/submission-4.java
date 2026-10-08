class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            adj.put(i,new ArrayList<Integer>());
        }

        for( int[] preq :prerequisites){
            adj.get(preq[0]).add(preq[1]);
        }
        for(int c : adj.keySet()){
            if(!dfs(c,adj,new HashSet<Integer>())) return false;
        }
        return true;
    }

    public boolean dfs(int n, HashMap<Integer, List<Integer>> adj, HashSet<Integer> path){
        if(path.contains(n)) return false;
        if(adj.get(n).isEmpty()) return true;
        path.add(n);
        for(int preqs: adj.get(n)){
            if(!dfs(preqs,adj,path)) return false;
        }
        path.remove(n);
        adj.put(n,new ArrayList<>());
        return true;
    }
}
