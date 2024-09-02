class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        for(int i=n-2; i>=0; i--){
            if(i == n-2){
                cost[i] = Math.min(cost[i], cost[i] + cost[i+1]);
            } else {
                cost[i] += Math.min(cost[i+1], cost[i+2]);
            }
        }
        
        return Math.min(cost[0], cost[1]);
    }
}