class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        return hm.size() == hs.size();
    }
}
