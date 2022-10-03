class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        String temp = "";
        for(int i=0; i<n; i++){
            temp = s.substring(i+1, n) + s.substring(0,i+1);
            if(temp.equals(goal)){
                return true;
            }
        }
        return false;
    }
}