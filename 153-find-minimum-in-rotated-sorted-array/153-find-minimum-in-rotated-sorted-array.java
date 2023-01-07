class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int l = 0, r = nums.length-1;
        
        while(l<=r){
            int m = l +(r-l)/2;
            if(m > 0 && nums[m-1] > nums[m]){
                return nums[m];
            } else if(nums[m] >= nums[l] && nums[m] > nums[r]){
                l = m+1; 
            } else {
                r = m-1;
            }   
        }
        return nums[l];
    }
}