class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2> len1){
            return -1;
        }
        int i, j, k, count;
        for(i=0; i<len1; i++){
            k=i;
            count = 0;
            if(i<=(len1-len2)){
                for(j=0; j<len2; j++){
                if(haystack.charAt(k) != needle.charAt(j)){
                    break;
                } else {
                    count++;
                    k++;
                }
            }
            if(count == len2){
                return i;
            }
            }
            
        }
        return -1;
    }
}