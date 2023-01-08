class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnding = nums[0], n = nums.length, ans = nums[0];
        
        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            ans = Math.max(maxEnding, ans);
        }
        return ans;
    }
}