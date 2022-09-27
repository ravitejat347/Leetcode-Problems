class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int res[] = new int[len];
        int x = 0, y = len-1;
        for(int i=len-1; i>=0; i--){
            if((Math.abs(nums[x])) >= (Math.abs(nums[y]))){
                res[i] = nums[x]*nums[x];
                x++;
            } else {
                res[i] = nums[y]*nums[y];
                y--;
            }
        }
        return res;
    }
}