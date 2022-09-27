class Solution {
    public String firstPalindrome(String[] words) {
        int len = words.length;
        for(int i=0; i<len; i++){
            String s = words[i];
            int l=0,r=s.length()-1;
            int flag = 0;
            while(l<r){
                if(s.charAt(l) == s.charAt(r)){
                    l++;
                    r--;
                } else {
                    flag = 1;
                    break;
                }
            }
            if(l == r || flag == 0){
                return s;
            }
        }
        return "";
    }
}