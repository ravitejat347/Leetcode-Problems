class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum =0, n = arr.length;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        if(sum%3 !=0){
            return false;
        }
        int psum = sum/3,count=0, tsum = 0;
        for(int i=0; i<n; i++){
            tsum += arr[i];
            if(tsum == psum){
                count++; 
                tsum = 0;
            }
        }
        if(count >= 3){
            return true;
        }
        return false;
    }
}
