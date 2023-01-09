class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1, n = nums.length;
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
            if(nums[i] < 0){
                ans[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return ans;
    }
}