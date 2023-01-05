class Solution {
    public int findMiddleIndex(int[] nums) {
           int sum = 0, ls = 0, n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        for(int i=0; i<n; i++){
            if(ls == sum-ls-nums[i]){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
}