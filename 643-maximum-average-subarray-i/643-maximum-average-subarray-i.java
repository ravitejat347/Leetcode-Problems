class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0, j=0, n =nums.length;
        double sum = 0, avg =0, res = Integer.MIN_VALUE;
        while(j<n){
            sum += nums[j];
            if(j-i+1 < k){
                j++;
            } else if(j-i+1 == k){
                avg = sum/k;
                res = Math.max(avg, res);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return res;
    }
}