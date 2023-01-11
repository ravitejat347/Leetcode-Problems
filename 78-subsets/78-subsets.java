class Solution {
    List<List<Integer>> output = new ArrayList();
    int n;
    
    public void sub(int index, ArrayList<Integer> curr, int[] nums, int n){
        if(index == n){
            output.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        sub(index+1, curr, nums, n);
        curr.remove(curr.size() - 1);
        sub(index+1, curr, nums, n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        sub(0, new ArrayList<Integer>(), nums, n);
        return output;
    }
}