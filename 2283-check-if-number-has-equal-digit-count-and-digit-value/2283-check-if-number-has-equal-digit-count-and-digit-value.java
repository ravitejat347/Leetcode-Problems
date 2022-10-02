class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = num.length();
        for(char c = '0'; c<= '9'; c++){
            hm.put(c,0);
        }
        for(int i=0; i<n; i++){
            hm.put(num.charAt(i), hm.get(num.charAt(i))+1);
        }
        int i=0;
        for(char c = '0'; c<='9' && i<n; c++, i++){
           if((hm.get(c) != Character.getNumericValue(num.charAt(i)))){
               return false;
           } 
        }
        return true;
    }
}