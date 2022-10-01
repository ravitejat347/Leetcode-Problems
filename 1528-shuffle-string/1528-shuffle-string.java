class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char str[] = new char[n];
        for(int i=0; i<n; i++){
            str[indices[i]] = s.charAt(i); 
        }
        return String.valueOf(str);
    }
}