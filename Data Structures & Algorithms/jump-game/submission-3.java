class Solution {
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> memo = new HashMap<>();

        return dfs(nums,0,memo);
        
    }

    public boolean dfs(int[] nums, int index, HashMap<Integer,Boolean> memo){
        if(memo.containsKey(index)) return memo.get(index);

        if(index >= nums.length-1) return true;

    
        for(int i = nums[index]; i >= 1; i--){

            if(dfs(nums,index + i,memo)){
                return true;
            }

        }
        memo.put(index,false);
        return false;

    }
}
