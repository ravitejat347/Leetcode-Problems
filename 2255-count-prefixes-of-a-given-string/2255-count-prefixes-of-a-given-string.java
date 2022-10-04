class Solution {
    public int countPrefixes(String[] words, String s) {
     int n = words.length, m = s.length(),count = 0;
        for(int i=0; i<n; i++){
            String temp = words[i];
            int len = temp.length();
            
            if(m >= len && temp.equals(s.substring(0,len))){
                    count++;
            }
        }
        return count;
    }
}