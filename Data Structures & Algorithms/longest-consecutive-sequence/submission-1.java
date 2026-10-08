
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        HashSet<Integer> start = new HashSet<>();


        for(int i : nums){
            if(!set.contains(i-1)){
                start.add(i);
            }
        }
        
        int maxLen = 0;
        for (int s:start){
            System.out.println("Checking " + s);
            int len = 1;
            int next = s+1;
            while (set.contains(next)){
                System.out.print(next + " ");
                len++;
                next++;
                
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
        

        
    }
}