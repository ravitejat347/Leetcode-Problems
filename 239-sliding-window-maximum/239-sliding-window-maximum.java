class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<Integer>();
        int i=0, j=0;
        while(j<n){
            while(!dq.isEmpty() && nums[j] > dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(nums[j]);
            
            if(j-i+1 < k ){
                j++;
            } else if(j-i+1 == k){
                ans[i] = dq.getFirst();
                if(nums[i] == dq.getFirst()){
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
