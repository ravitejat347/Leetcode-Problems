class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = s.length(), start = 0 ,end;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ' '){
                end = i-1;
                reverseString(arr, start, end);
                start = i+1;
            }
        }
        reverseString(arr,start, n-1);
        return String.valueOf(arr);
    }
     public void reverseString(char[] s, int i, int j) {
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}