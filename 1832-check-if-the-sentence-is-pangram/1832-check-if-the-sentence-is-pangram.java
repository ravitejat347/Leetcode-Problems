class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<Character>();
        String s = "abcdefghijklmnopqrstuvwxyz";
        int n = sentence.length();
        for(int i=0; i<n; i++){
            hs.add(sentence.charAt(i));
        }
        int i=0;
        while(i<26){
            if(!hs.contains(s.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }
}