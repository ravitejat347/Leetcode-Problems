class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
            hm.put(i,hm.getOrDefault(i,0)+1);
        
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            int n = (int)m.getValue();
            res += n*(n-1)/2;
        }
        
        return res;
    }
}