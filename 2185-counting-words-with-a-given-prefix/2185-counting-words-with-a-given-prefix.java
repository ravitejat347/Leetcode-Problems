class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length, m = pref.length(),count = 0;
        for(int i=0; i<n; i++){
            String s = words[i];
            int len = s.length();
            if(m <= len){
                s = s.substring(0,m);
                if(s.equals(pref)){
                    count++;
                }
            }
        }
        return count;
    }
}