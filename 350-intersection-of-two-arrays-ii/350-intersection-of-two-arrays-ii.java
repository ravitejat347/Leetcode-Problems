class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums1){
            if(!hm.containsKey(i)){
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i)+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(hm.containsKey(i) && hm.get(i) != 0){
                list.add(i);
                hm.put(i, hm.get(i)-1);
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for(int i: list)
            res[index++] = i;
        return res;
    }
}