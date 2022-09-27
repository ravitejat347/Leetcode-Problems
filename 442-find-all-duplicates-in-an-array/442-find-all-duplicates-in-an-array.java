class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<len; i++){
            int id = Math.abs(nums[i]);
            if(nums[id -1] < 0){
                res.add(id);
            } else {
                nums[id-1] *= -1;
            }
        }
        return res;
    }
}