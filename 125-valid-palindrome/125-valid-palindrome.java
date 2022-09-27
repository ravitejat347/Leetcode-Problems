class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j = s.length()-1;
        char[] c = s.toCharArray();
        while(i < j){
            if(!Character.isLetterOrDigit(c[i]))
                    i++;
            if(!Character.isLetterOrDigit(c[j]))
                    j--;
            if(Character.isAlphabetic(c[i]) && Character.isAlphabetic(c[j])){
                if(Character.toLowerCase(c[i]) == Character.toLowerCase(c[j])){
                    i++;
                    j--;
                } else {
                    return false;
                }
            }else if(Character.isDigit(c[i]) && Character.isDigit(c[j])){
                if(c[i] == c[j]){
                    i++;
                    j--;
                } else {
                    return false;
                }
             } else if((Character.isAlphabetic(c[i]) && Character.isDigit(c[j])) ||(Character.isAlphabetic(c[j]) && Character.isDigit(c[i]))) {
                return false;
                } 
            }
        return true;
    }
}