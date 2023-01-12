class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n ; i++){
            if(st.isEmpty() && 
               (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            } else if(s.charAt(i) == '(' || 
                      s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
               // System.out.println(st.peek());
            } else if(!st.isEmpty()) {
                if((s.charAt(i) == ')' && st.peek() == '(') 
                   || (s.charAt(i) == '}' && st.peek() == '{') 
                   || (s.charAt(i) == ']' && st.peek() == '[')){
                    //System.out.println(st.peek()+ " "+ s.charAt(i));
                    st.pop();
                    
                } else {
                    return false;
                }
            }
        }    
        if(st.isEmpty()){
                return true;
        }
        return false;
    }
}