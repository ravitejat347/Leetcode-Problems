class Solution {
    public int searchInsert(int[] nums, int target) {
        int n =nums.length;
        int l = 0, r = n-1;
        while(l<=r){
            int m = (l+r)/2;
            if(target == nums[m]){
                return m;
            } else if(target < nums[m]){
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }
}