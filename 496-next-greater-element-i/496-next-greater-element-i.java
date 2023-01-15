class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length; 
        int[] ans = new int[m];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && nums2[i] > st.peek()){
                    st.pop();
            }
            if(!st.isEmpty()){
                hm.put(nums2[i],st.peek());
            } else {
                hm.put(nums2[i], -1);
            }
            st.push(nums2[i]);
        }
        for(int i=0; i<m; i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
}