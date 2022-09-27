class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0, len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] != 0 ){
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i=count; i<len; i++){
            nums[i] = 0;
        }
    }
}