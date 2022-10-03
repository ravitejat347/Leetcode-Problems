class Solution {
    public int countCharacters(String[] words, String chars) {
        int fchars[] = new int[26];
        int n = chars.length(), sum =0;
        for(int i=0; i<n; i++){
            fchars[chars.charAt(i) - 'a']++;
        }
        int m = words.length;
        for(int i=0; i<m; i++){
            String s = words[i];
            int len = s.length();
            int wfreq[] = new int[26];
            for(int j=0; j<len; j++){
                wfreq[s.charAt(j)-'a']++;
            }
            int k;
            for(k=0; k<26; k++){
                if(wfreq[k] > fchars[k]){
                    break;
                }
            }
            if(k == 26){
                sum += len;
            }
        }
        return sum;
    }
}