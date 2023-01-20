class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i=0, j=0, n = s.length(), m = t.length();
        String ans = "";
        for(int k=0; k<m; k++){
            hm.put(t.charAt(k), hm.getOrDefault(t.charAt(k), 0)+1);
        }
        int count = hm.size(), min = Integer.MAX_VALUE;
        while(j<n){
            if(hm.containsKey(s.charAt(j))){
                hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
                if(hm.get(s.charAt(j)) == 0){
                    count--;
                }
            }
            if(count > 0){
                j++;
            } else if(count == 0){
                    while(count == 0){
                        if(min > j-i+1){
                                ans = s.substring(i,j+1);
                                min = Math.min(min,j-i+1);
                        }
                        if(hm.containsKey(s.charAt(i))){
                            hm.put(s.charAt(i), 
                                   hm.get(s.charAt(i))+1);
                            if(hm.get(s.charAt(i)) == 1){
                                count++;
                            }
                        }
                        i++;
                    }
                    j++;
            }
        }
        return ans;
    }
}