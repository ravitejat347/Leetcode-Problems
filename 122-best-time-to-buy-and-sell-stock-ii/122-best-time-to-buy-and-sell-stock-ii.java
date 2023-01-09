class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, n = prices.length;
        int maxProfit = 0;
        while(r < n){
            if(prices[r] > prices[l]){
                int profit = prices[r] - prices[l];
                maxProfit += profit;
            } 
            l++;
            r++;
        }
        return maxProfit;
    }
}