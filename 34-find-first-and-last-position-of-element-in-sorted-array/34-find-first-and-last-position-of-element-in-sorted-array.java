class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =0, end = nums.length-1, mid = start+(end-start)/2;
        int[] ans = {-1,-1};
        while(start <= end){
            if(nums[mid] == target){
                ans[0] = mid;
                end = mid -1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = start + (end-start)/2;
        }
        end = nums.length-1;
        mid = start+(end-start)/2;
        while(start <= end){
            if(nums[mid] == target){
                ans[1] = mid;
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else if(nums[mid] < target){
                start = mid + 1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
}