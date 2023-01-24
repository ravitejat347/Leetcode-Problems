class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int m = word1.length(), n = word2.length();
        for(int i=0; i<m; i++){
            arr1[word1.charAt(i)-'a']++;
        }
        for(int i=0; i<n; i++){
            arr2[word2.charAt(i)-'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(Math.abs(arr1[i]-arr2[i]) > 3){
                return false;
            }
        }
        return true;
    }
}