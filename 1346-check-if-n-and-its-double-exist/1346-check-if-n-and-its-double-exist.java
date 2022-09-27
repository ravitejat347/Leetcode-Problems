class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        int len = arr.length, i=0;
        while(i < len){
            hs.put(arr[i]*2,i);
            i++;
        }
        i=0;
        while(i < len){
            if(hs.containsKey(arr[i]) && i != hs.get(arr[i])){
                return true;
            }
            i++;
        }
        return false;
    }
}