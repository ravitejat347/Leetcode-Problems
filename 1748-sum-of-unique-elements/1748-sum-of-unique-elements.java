class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        int n = nums.length;
        for(int i=0; i<n; i++){
            arr[nums[i]]++;
        }
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(arr[i] == 1){
               sum += i;
            }
        }
        return sum;
    }
}