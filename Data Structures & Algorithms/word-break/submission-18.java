class Solution {

    /*This solution iterates through the strings, finds out if a prefix is within the wordDict and performs a dfs, now testing the remaining string against the word Dict. It tracks the index to eliminate branches that end in negative results */
    HashMap<Integer,Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);

        return dfs(s,dict,0);   
    }



    public boolean dfs(String s, HashSet<String> dict,int i){
        if(memo.containsKey(i)) {
            return memo.get(i);
        }
        int r = 0;
        while( r < s.length()){
            String cur = s.substring(0,r+1);
            if(dict.contains(cur)){
                if(dfs(s.substring(r+1),dict,r+1)) return true;
                else{
                    memo.put(i,false);
                }
            }
            r++;
        }
        if(r == 0) return true;
        return false;
    }
}
