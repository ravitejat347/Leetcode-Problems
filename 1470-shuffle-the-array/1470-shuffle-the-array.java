class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int i=0, j=0;
        while(i<n){
            res[j] = nums[i];
            j += 2;
            i++;
        }
        i=n; j=1;
        while(i<2*n){
            res[j] = nums[i];
            j += 2;
            i++;
        }
        return res;
    }
}