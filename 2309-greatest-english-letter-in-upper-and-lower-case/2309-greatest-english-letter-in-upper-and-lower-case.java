class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> hs = new HashSet<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
        }
        for(char c='Z'; c >='A'; c--){
            if(hs.contains(c) && hs.contains(Character.toLowerCase(c))){
                return String.valueOf(c);
            }
        }
        return "";
    }
}