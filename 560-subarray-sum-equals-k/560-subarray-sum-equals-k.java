class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, sum = 0, count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                } 
            }
            sum = 0;
        }
        return count;
    }
}