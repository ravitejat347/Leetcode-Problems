class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray(), arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int len = t.length(), n =s.length(), i;
        for(i=0; i<len && i < n; i++){
            if( arr1[i] != arr2[i]){
                return arr2[i];
            } 
        }
        return arr2[i];
    }
}