class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = nums[0], n = nums.length, res1 = nums[0];
        int minEnding = nums[0], res2 = nums[0];
        
        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);
            res1 = Math.max(maxEnding, res1);
            
            minEnding = Math.min(minEnding + nums[i], nums[i]);
            res2 = Math.min(minEnding, res2);
        }
        return Math.max(res1, Math.abs(res2));
    }
}