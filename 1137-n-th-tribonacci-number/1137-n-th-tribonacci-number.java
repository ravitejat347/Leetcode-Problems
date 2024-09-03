class Solution {
    public int f(int[] dp, int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(dp, n-1) + f(dp, n-2) + f(dp, n-3);
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return f(dp, n);
    }
}