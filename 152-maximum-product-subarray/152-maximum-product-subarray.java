class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0], n = nums.length, minEnding = nums[0], ans = maxEnding;
        
        for(int i=1; i<n; i++){
            int temp_max = Math.max(nums[i], Math.max(maxEnding * nums[i], minEnding * nums[i]));
           
            minEnding = Math.min(nums[i], Math.min(maxEnding * nums[i], minEnding * nums[i]));
            maxEnding = temp_max;
            ans = Math.max(maxEnding, ans);
            
        }
        return ans;
    }
}