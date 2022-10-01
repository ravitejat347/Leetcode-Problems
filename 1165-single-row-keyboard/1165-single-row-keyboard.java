class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int kl = keyboard.length(), wl = word.length();
        for(int i=0; i<kl; i++){
            hm.put(keyboard.charAt(i), i);
        }
        int sum = hm.get(word.charAt(0));
        for(int i=1; i<wl; i++){
            sum += Math.abs(hm.get(word.charAt(i)) - hm.get(word.charAt(i-1)));
        }
        return sum;
    }
}