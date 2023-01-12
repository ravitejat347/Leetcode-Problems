class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length, col = accounts[0].length;
        int ans = 0;
        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum += accounts[i][j];
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}