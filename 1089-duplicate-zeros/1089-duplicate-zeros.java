class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros =0;
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        int i = len-1, j=len+zeros-1;
        while(i != j){
            insert(arr, i, j--);
            if(arr[i] == 0){
                insert(arr, i, j--);
            }
            i--;
        }
    }
    private void insert(int arr[], int i, int j){
        if(j < arr.length){
            arr[j] = arr[i];
        }
    }
}