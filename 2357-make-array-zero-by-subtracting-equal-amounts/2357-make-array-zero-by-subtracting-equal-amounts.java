class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        int sum =0;
        for(int i=0; i<len; i++){
                sum += nums[i];
        }
        if(sum == 0){
            return 0;
        }
        
        int count = 0;
        while(true){
            int min = Integer.MAX_VALUE; 
            for(int i=0; i<len; i++){
                if(nums[i] <= min && nums[i] !=0){
                    min = nums[i];
                }
            }
            for(int i=0; i<len; i++){
                if(nums[i] != 0){
                    nums[i] -= min;
                }
            }
            count++;
            sum =0;
            for(int i=0; i<len; i++){
                sum += nums[i];
            }
            if(sum == 0){
                break;
            }
        }
        return count;
    }
}