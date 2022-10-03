class Solution {
    public int rearrangeCharacters(String s, String target) {
        int m = s.length(), n = target.length(), res = Integer.MAX_VALUE;
        int[] sfreq = new int[26],tfreq = new int[26];
        for(int i=0; i<m; i++){
            sfreq[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<n; i++){
            tfreq[target.charAt(i) - 'a']++;
        }
        for(int i=0; i<n; i++){
            res = Math.min
                (res, sfreq[target.charAt(i)-'a']/tfreq[target.charAt(i)-'a']);
        }
        return res;
    }
}