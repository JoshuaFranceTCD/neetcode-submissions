class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }
        int missing = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(i)) return i;
        }
        return missing;
    }
}
