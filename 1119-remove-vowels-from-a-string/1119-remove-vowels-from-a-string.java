class Solution {
    public String removeVowels(String s) {
        String res = "";
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                res += s.charAt(i);
            }
        }
         return res;
    }
}