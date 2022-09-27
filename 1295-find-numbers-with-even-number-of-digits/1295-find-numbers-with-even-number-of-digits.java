class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int num, count, evenCount=0; 
        for(int i=0; i<len; i++){
            num = nums[i];
            count =0;
            while(num != 0){
                num /= 10;
                count++;
            }
            if(count%2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}