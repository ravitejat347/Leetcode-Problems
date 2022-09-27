class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        int len = nums.length;
        if(len == 1){
            return 1;
        }
        while(i<len-1 && j<len){
            if(nums[i] != nums[j]){
                i++;
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j++;
        }
        return ++i;
    }
}