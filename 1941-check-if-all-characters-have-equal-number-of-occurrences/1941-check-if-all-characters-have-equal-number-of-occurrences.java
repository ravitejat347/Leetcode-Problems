class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
        }
        int temp = hm.get(s.charAt(0));
        for(int i=1; i<n; i++){
            if(hm.get(s.charAt(i)) != temp){
                return false;
            }
        }
        return true;
    }
}