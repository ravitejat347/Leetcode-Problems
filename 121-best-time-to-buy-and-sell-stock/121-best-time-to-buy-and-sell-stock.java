class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, n = prices.length;
        int maxProfit = 0;
        while(r < n){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}