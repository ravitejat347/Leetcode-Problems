class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0,j=0,max=0;
        while(j < s.length()){
            if(hm.containsKey(s.charAt(j))){
                i = Math.max(hm.get(s.charAt(j))+1, i);
            }
            hm.put(s.charAt(j),j);
            max = Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}