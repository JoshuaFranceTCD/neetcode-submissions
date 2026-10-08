class Solution {
    public int rob(int[] nums) {
        
        return Math.max(nums[0],
               Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)),
               helper(Arrays.copyOfRange(nums, 0, nums.length - 1))));
        
    }

    public int helper(int[] nums){
        int max1 = 0, max2 = 0; //max2 - max of 2nd house over.Max1 = max adjacent house
        for(int i = 0; i < nums.length; i++){
            int rob = Math.max(max1, nums[i] + max2);
            max2 = max1;
            max1 = rob;
        }
        return max1;
    }
}
