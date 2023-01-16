public class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2*n-1; i>=0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i%n]) {
                st.pop();
            }
            res[i%n] = st.empty() ? -1 : nums[st.peek()];
            st.push(i%n);
        }
        return res;
    }
}