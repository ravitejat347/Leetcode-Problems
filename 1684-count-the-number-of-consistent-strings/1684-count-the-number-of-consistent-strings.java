class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        int n = allowed.length(), m = words.length, count =0;
        for(int i=0; i<n; i++){
            if(!hs.contains(allowed.charAt(i))){
                hs.add(allowed.charAt(i));
            }
        }
        for(int i=0; i<m; i++){
            String str = words[i];
            int j = 0, len = str.length();
            while(j < len){
                if(!hs.contains(str.charAt(j))){
                    break;
                }
                j++;
            }
            if(j == len){
                count++;
            }
        }
        return count;
    }
}