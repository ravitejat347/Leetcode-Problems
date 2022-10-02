class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length(),count = 0, i;
        String res = "";
        for(i=0; i<n; i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            if(count == k){
                break;
            }
        }
        for(int j=0; j<i; j++){
            res += s.charAt(j);
        }
        return res;
    }
}