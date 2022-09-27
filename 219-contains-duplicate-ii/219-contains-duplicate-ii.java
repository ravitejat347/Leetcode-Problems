class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length,j;
        for(int i=0;i<len; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            } else {
                j = map.get(nums[i]);
                if(Math.abs(i-j) <= k){
                    return true;
                }
                map.replace(nums[i], i);
            }
        }
        return false;
    }
}