class Solution {
    HashMap<Integer,Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);

        return dfs(s,dict,0);   
    }

    public boolean dfs(String s, HashSet<String> dict,int i){
        if(memo.containsKey(i)) {
            return memo.get(i);
        }
        int l = 0, r = 0;
        while( r < s.length()){
            String cur = s.substring(l,r+1);
            if(dict.contains(cur)){
                if(dfs(s.substring(r+1),dict,r+1)) return true;
                else{
                    memo.put(i,false);
                }
            }
            r++;
        }
        if(l == r) return true;
        return false;
    }
}
