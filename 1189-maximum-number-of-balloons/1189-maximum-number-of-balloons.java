class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
        int[] f = new int[26], tfreq = new int[26];
        int m = text.length(),n = s.length(), res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            f[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<m; i++){
            tfreq[text.charAt(i) -'a']++;
        }
        for(int i=0; i<n; i++){
            res = Math.min(res, tfreq[s.charAt(i) -'a']/f[s.charAt(i)-'a']);
        }
        return res;
    }
}