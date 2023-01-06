class Solution {
    public int missingNumber(int[] nums) {
        int expsum = 0, actsum = 0;
        for(int i=0; i <= nums.length; i++){
            expsum += i;
        }
        for(int i=0; i<nums.length; i++){
            actsum += nums[i];
        }
        return expsum-actsum;
    }
}