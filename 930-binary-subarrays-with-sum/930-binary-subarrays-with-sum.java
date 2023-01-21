class Solution {
	public int numSubarraysWithSum(int[] nums, int goal) {
		return helper(nums, goal) - helper(nums, goal - 1);
	}

	private int helper(int[] nums, int limit) {
		int res = 0, sum = 0, len = nums.length;
		int i = 0 ,j = 0;
		while (j < len) {
			sum += nums[j];
			j++;
			while (i < j && sum > limit) {
				sum -= nums[i];
				i++;
			}
			res += j-i+1;
		}
		return res;
	}
}