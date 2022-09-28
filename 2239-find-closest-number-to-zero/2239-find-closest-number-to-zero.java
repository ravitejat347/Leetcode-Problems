class Solution {
    public int findClosestNumber(int[] nums) {
       int small = nums[0];
        
            for (int i = 1; i < nums.length; i++) {

                if (Math.abs(small) == (nums[i])){
                    small = nums[i];
                }
                if(Math.abs(nums[i]) < Math.abs(small)){
                    small = nums[i];
                }
            }
        return small;
    }
}