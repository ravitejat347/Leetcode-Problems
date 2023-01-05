class Solution {
    public boolean checkString(String s) {
        int count =0, n = s.length();
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                count ++;
            }
        }
        if(count >= 1){
            return false;
        }
        return true;
    }
}