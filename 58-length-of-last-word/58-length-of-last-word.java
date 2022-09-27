class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1){
            return 1;
        }
        int i = s.length()-1;
        int count = 0;
        if(s.charAt(i) == ' '){
            while(s.charAt(i) == ' '){ 
                i--; 
            }
            while(i >= 0 && s.charAt(i) != ' '){
                count++;
                i--; 
            }
             
        } else {
            while(i >= 0 && s.charAt(i) != ' '){
                count++;
                i--; 
            }
        }
        return count;
    }
}