class Solution {
    public String interpret(String command) {
        int n = command.length();
        String res = "";
        for(int i=0; i<n; i++){
            if(command.charAt(i) == 'G'){
                res += "G";
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                res += "o";
                i++;
            } else {
                res += "al";
                i += 3;
            }
        }
        return res;
    }
}