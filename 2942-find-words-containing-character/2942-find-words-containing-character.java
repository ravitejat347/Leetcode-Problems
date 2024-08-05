class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int m = words.length;
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<m; i++){
            int j=0;
            int n = words[i].length();
            while(j<n){
                if(words[i].charAt(j) == x){
                    result.add(i);
                    break;
                }
                j++;
            }
        }
        return result;
    }
}