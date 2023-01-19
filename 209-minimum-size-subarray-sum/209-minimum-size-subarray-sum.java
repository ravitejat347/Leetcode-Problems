class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, n = nums.length, sum = 0, ans = Integer.MAX_VALUE, flag=0;
        while(j < n){
            sum += nums[j];
            if(sum < target){
                j++;
            } else if(sum == target){
                flag = 1;
                ans = Math.min(j-i+1, ans);
                j++;
            } else if(sum > target){
                while(sum > target){
                    flag =1;
                    ans = Math.min(j-i+1, ans);
                    sum -= nums[i];
                    i++;
                    if(sum >= target){
                        ans = Math.min(j-i+1, ans);
                    }
                }
                j++;
            }
        }
        if(flag == 1){
            return ans;
        }
        return 0;
    }
}