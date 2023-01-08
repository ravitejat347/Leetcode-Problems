class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n: nums)
            hs.add(n);
        int ans = 0, length = 0;
        for(int n: nums){
            if(!hs.contains(n-1)){
                length = 0;
                while(hs.contains(n+length)){
                 length++;
                }
                ans = Math.max(length, ans);
            }
        }
        return ans;
    }
}