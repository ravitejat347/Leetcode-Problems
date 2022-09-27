class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
      
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}