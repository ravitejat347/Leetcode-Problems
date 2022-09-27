class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length, i=0, j=len-1;
            while(i<j){
                if(nums[i]%2 !=0 && nums[j]%2 ==0){
                swap(nums,i,j);
                    i++;
                    j--;
                } else if(nums[i]%2 != 0 && nums[j]%2 != 0){
                    j--;
                } else if(nums[i]%2 == 0 && nums[j]%2 == 0){
                    i++;
                }else {
                    i++;
                    j--;
                }
            }
        return nums;
    }
    public void swap(int nums[], int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
    }
}