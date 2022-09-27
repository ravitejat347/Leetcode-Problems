class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            int id = Math.abs(nums[i]);
            if(nums[id-1] > 0){
                nums[id-1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<len; i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }
}