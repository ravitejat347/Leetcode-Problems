class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int tall = 0, n = heights.length;
        for(int i = 0; i<n-1; i++){
            tall = heights[i];
            for(int j=i+1; j<n; j++){
                if(heights[j] > heights[i]){
                    int temp = heights[i];
                        heights[i] = heights[j];
                        heights[j] = temp;
                    String str = names[i];
                        names[i] = names[j];
                        names[j] = str;
                }
            }
        }
        return names;
    }
}