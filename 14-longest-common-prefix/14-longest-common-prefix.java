class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String base = strs[0];
        String output = "";
        int count = 0,matched = 0;
        for(int i=1; i<strs.length; i++){
            String match = strs[i];
            for(int j=0; j<base.length() && j<match.length(); j++){
                if(base.charAt(j) == match.charAt(j)){
                    matched ++;
                } else {
                    break;
                }
            }
            if(i == 1){
                count = matched;
            } else if(count >= matched) {
                count = matched;
            }
            matched =0;
        }
        if(count >= 1){
            for(int i=0; i<count; i++){
                output += base.charAt(i);  
            }
        }
        return output;
    }
}