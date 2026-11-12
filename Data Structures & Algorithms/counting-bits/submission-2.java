class Solution {
    public int[] countBits(int n) {

        int[] counts = new int[n+1];
        for(int i = 0; i <= n; i++){
            counts[i] = Integer.bitCount(i);
        }

        return counts;

        
    }
}
