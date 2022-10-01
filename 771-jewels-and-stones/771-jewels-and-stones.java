class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int n = jewels.length(), i = 0, m = stones.length(), count = 0;
        while(i<n){
            if(!set.contains(jewels.charAt(i))){
                set.add(jewels.charAt(i));
            }
            i++;
        }
        i = 0;
        while(i<m){
            if(set.contains(stones.charAt(i))){
               count++; 
            }
            i++;
        }
        return count;
    }
}