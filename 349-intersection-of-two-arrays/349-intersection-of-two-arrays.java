class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums1)
            hs.add(i);

        HashSet<Integer> itr = new HashSet<>();
        for(int i : nums2){
            if(hs.contains(i)){
                itr.add(i);
            }
        }
        int[] res = new int[itr.size()];
        int index = 0;
        for(int i : itr)
            res[index++] = i;

        return res;
    }   
}