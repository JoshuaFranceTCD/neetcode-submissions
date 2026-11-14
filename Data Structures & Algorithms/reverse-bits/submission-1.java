class Solution {
    public int reverseBits(int n) {

        int rev = 0;
        int num = n;

        for(int i = 0; i < 32; i++){
            rev = rev << 1;
            rev += num % 2;
            num = num >>> 1;
        }
        return rev;
        
    }
}
