class Solution {
    HashMap<Integer,Integer> memo = new HashMap<>();
    public int lengthOfLIS(int[] nums) {
        memo.clear();
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, dfs(nums,i));
        }
        return max;
    }

    public int dfs(int[] nums, int index){
        //System.out.println(nums[index]);
        if(memo.containsKey(index)) return memo.get(index);
        int max = 1;
        for(int i = index + 1; i < nums.length ; i++){
            if(nums[i] > nums[index]){
                max = Math.max(max,1 + dfs(nums,i));
            }
        }
        memo.put(index,max);
        return max;
    }
}
