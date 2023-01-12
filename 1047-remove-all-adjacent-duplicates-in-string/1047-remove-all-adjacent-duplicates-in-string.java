class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(st.isEmpty() || (!st.isEmpty() && s.charAt(i) != st.peek())){
                st.push(s.charAt(i));
            } else if(!st.isEmpty() && (s.charAt(i) == st.peek())){
                    st.pop();
            }
        }
        String ans = "";
        for(char c: st){
            ans += c;
        }
        return ans;
    }
}