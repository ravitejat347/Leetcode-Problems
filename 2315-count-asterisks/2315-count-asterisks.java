class Solution {
    public int countAsterisks(String s) {
        int count = 0, n = s.length(), res = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '|'){
                count++;
            }
            if(count%2 == 0 && s.charAt(i) == '*'){
                res++;
            }
        }
        return res;
    }
}