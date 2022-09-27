class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int len = nums.length, i=0;
        while(i < len){
            hs.add(nums[i]);
            i++;
        }
        while(hs.contains(original)){
            original *= 2;
        }
        return original;
    }
}