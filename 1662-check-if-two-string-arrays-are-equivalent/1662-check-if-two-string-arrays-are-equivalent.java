class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a ="", b = "";
        int m = word1.length, n = word2.length;
        for(int i=0; i<m; i++){
            a += word1[i];
        }
        for(int i=0; i<n; i++){
            b += word2[i];
        }
        return (a.equals(b));
    }
}