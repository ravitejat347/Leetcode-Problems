class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int n = nums.length-1, majorElem = nums[0], count = 1;
        
        for(int i=1; i<=n; i++){
            if(nums[i] != majorElem){
                count--;
                if(count == 0){
                    majorElem = nums[i];
                    count++;
                }
            } else {
                count++;
            }
        }
        return majorElem;
    }
}