class Solution {
    public int sumOfDigits(int[] nums) {
        int n = 101;
        for(int i: nums){
            n = Math.min(i, n);
        }
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return (sum%2 == 0) ? 1 : 0; 
    }
}