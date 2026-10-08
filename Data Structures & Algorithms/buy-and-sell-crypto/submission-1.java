class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while (left < prices.length && right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
                right++;
            }
            else{
                int profit = prices[right] - prices[left];
                max = Math.max(max, profit);
                right++;
            }
        }
        return max;
        
    }
}
