class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int i = 0, j  = 0, n = s.length(), ans = 0;
        if(n < 2){
            return n;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        while(j < n){
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)+1);
            if(hm.size() <= 2){
                ans = Math.max(j-i+1, ans);
                j++;
            } else if(hm.size() > 2){
                while(hm.size() > 2){
                    hm.put(s.charAt(i), hm.get(s.charAt(i))-1);
                    if(hm.get(s.charAt(i)) == 0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}