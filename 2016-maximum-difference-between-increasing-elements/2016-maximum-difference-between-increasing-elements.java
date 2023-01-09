class Solution {
    public int maximumDifference(int[] nums) {
        int l =0, r =1, n = nums.length;
        int maxDiff = -1;
        while(r<n){
            if(nums[l] < nums[r]){
                int diff = nums[r] - nums[l];
                maxDiff = Math.max(diff, maxDiff);
            } else {
                l = r;
            }
            r++;
        }
        return maxDiff;
    }
}