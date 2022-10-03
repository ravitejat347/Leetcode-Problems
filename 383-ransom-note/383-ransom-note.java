class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int m = ransomNote.length();
        int n = magazine.length();
        for(int i=0; i<m; i++){
            if(!hm1.containsKey(ransomNote.charAt(i))){
                hm1.put(ransomNote.charAt(i), 1);
            } else {
                hm1.put(ransomNote.charAt(i), hm1.get(ransomNote.charAt(i))+1);
            }
        }
        
        for(int i=0; i<n; i++){
            if(!hm2.containsKey(magazine.charAt(i))){
                hm2.put(magazine.charAt(i), 1);
            } else {
                hm2.put(magazine.charAt(i), hm2.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0; i<m; i++){
            if(hm1.containsKey(ransomNote.charAt(i)) &&
                    !hm2.containsKey(ransomNote.charAt(i))){
                return false;
            }
            if(hm1.containsKey(ransomNote.charAt(i)) &&
                    hm2.containsKey(ransomNote.charAt(i)) && 
                      hm1.get(ransomNote.charAt(i)) > 
                        hm2.get(ransomNote.charAt(i))){
                return false;
            }
        }
        return true;
    }
}