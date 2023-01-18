class Solution {
    public int countGoodSubstrings(String s) {
        int res = 0, n = s.length();
        char arr[] = s.toCharArray();
        for(int i=1; i<n-1; i++)
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1] && arr[i-1] != arr[i+1])
                res++;   
        return res;
    }
}