class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        backtrack(0,new ArrayList<Integer>(),0, target, nums);

        return res;
        
    }

    public void backtrack(int i, List<Integer> cur, int total, int target, int[] nums ){
        if(total == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i >= nums.length || total > target) return;
        cur.add(nums[i]);
        backtrack(i,cur,total + nums[i],target,nums);
        cur.removeLast();
        backtrack(i+1,cur,total,target,nums);


    }
}
