class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int n = s.length(), count1 = 0, count2 = 0;
        for(int i=0; i<n/2; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count1++;
            }
        }
        for(int i=n/2; i<n; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }
}