class Solution {
    public int rob(int[] nums) {
        int[] rob = new int[nums.length];
        rob[0] = nums[0];
        for(int i = 1; i < nums.length;i++){
            if(i == 1){
                rob[i] = Math.max(rob[0],nums[i]);
            }
            else{
                rob[i] = Math.max(rob[i-1],nums[i]+ rob[i-2]);
            }
        }
        return rob[nums.length-1];
        
    }
}
