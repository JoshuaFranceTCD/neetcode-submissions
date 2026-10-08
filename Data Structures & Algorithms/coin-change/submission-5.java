class Solution {
    public int curMin = Integer.MAX_VALUE;
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int coinChange(int[] coins, int amount) {
         int min = dfs(coins, amount);
        
        return  min== Integer.MAX_VALUE ? -1: min ;
        
    }

    private int dfs(int[] coins, int amount){
        if(amount == 0) return 0;
        if(memo.containsKey(amount)) return memo.get(amount);
        int res = Integer.MAX_VALUE;
        for(int coin : coins){
            if(amount - coin >= 0){
                int leaf = dfs(coins,amount - coin);
                if(leaf != Integer.MAX_VALUE) res = Math.min(res, 1 + leaf);
            }
        }
        memo.put(amount,res);
        return res;
        


    }
}
