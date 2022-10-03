class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs = new HashSet<>();
        int n = s.length();
        char res = '\0';
        for(int i=0; i<n; i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            } else {
                res = s.charAt(i);
                break;
            }
        }
        return res;
    }
}