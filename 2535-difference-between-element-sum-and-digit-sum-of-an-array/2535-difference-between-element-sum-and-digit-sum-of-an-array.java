class Solution {
    public int differenceOfSum(int[] nums) {
        int s1 = 0, s2 = 0, n = nums.length;
        for(int i=0; i<n; i++){
            s1 += nums[i];
            if(nums[i] > 9){
                int x = nums[i];
                while(x > 0){
                    s2 += x%10;
                    x /= 10;
                }
            } else {
                s2 += nums[i];
            }
        }
        return Math.abs(s1-s2);
    }
}