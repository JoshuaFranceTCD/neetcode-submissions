class Solution {
    public int[] countBits(int n) {

        int[] counts = new int[n+1];
        int count = 0;
        int num = n;
        for(int i = 0; i <= n; i++){
        
            counts[i] = Integer.bitCount(i);
        }

        return counts;

        
    }
}
