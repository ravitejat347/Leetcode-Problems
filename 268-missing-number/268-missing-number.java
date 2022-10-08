class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, res =0;
        int[] arr = new int[n+1];
        for(int i=0; i<n; i++){
            arr[nums[i]] = -1;
        }
        for(int i=0; i<n+1; i++){
            if(arr[i] != -1){
                res = i;
            }
        }
        return res;
    }
}