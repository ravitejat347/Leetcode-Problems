class Solution {
    public int mostWordsFound(String[] sentences) {
        int i = 0, maxlen = 0, len = sentences.length;
        while(i < len){ 
            String abc = sentences[i];
            int j=0,count =1,stlen = abc.length();
            while(j < stlen){
                if(abc.charAt(j) == ' '){
                    count++;
                }
                j++;
            }
            i++;
            if(count >= maxlen){
                maxlen = count;
            }
            Math.max(maxlen, count);
        }
        return maxlen;
    }
}