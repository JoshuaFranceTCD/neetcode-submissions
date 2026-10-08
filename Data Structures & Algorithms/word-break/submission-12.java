class Solution {
    HashMap<Integer,Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {


        return dfs(s, wordDict, 0);
    }

    public boolean dfs(String s, List<String> wordDict, int i ){
        if(i == s.length()) return true;
        if(memo.containsKey(i)) return memo.get(i);
        for(String w : wordDict){
            if(i + w.length() > s.length()) continue;
            String temp = s.substring(i,w.length()+i);
            //System.out.println(temp);
            if(temp.equals(w)){
                if(dfs(s,wordDict, i + w.length())){
                    return true;
                }
                else{
                    memo.put(i,false);
                }
            }
        }
        return false;
    }
}
