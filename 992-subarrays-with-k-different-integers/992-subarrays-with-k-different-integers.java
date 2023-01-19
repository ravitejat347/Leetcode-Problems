class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
    int n1 = subarraysWithKDistinct_(A, K);
    int n2 = subarraysWithKDistinct_(A, K - 1);

    return n1 - n2;
}
    private int subarraysWithKDistinct_(int[] nums, int k) {
        int i = 0, j  = 0, n = nums.length, ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(j < n){
            hm.put(nums[j], hm.getOrDefault(nums[j], 0)+1);
            j++;
            if(hm.size() > k){
                while(hm.size() > k){
                    hm.put(nums[i], hm.get(nums[i])-1);
                    if(hm.get(nums[i]) == 0){
                        hm.remove(nums[i]);
                    }
                    i++;
                }
            }
            ans += j-i;
            
        }
        return ans;
    }
}
