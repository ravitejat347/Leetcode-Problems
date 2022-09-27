class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length, mx = -1,temp;
        for(int i=len-1; i>=0; i--){
            temp = arr[i];
            arr[i] = mx;
            mx = Math.max(mx,temp); 
        }
        return arr;
    }
}