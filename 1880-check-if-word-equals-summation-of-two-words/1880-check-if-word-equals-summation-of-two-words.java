class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int x = firstWord.charAt(0)-'a';
        int l = firstWord.length(), m = secondWord.length(), n = targetWord.length();
        String s1 = "",s2 = "", s3 = "";
        for(int i=0; i<l; i++){
            s1 += firstWord.charAt(i)-'a';
        } 
         for(int i=0; i<m; i++){
            s2 += secondWord.charAt(i)-'a';
        } 
         for(int i=0; i<n; i++){
            s3 += targetWord.charAt(i)-'a';
        } 
        if(Integer.parseInt(s1) + Integer.parseInt(s2) == Integer.parseInt(s3)){
            return true;
        }
        return false;
    }
}