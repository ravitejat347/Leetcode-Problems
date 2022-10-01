class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" "), str2 = new String[str.length];
        for(int i=0; i<str.length; i++){
            String temp = str[i];
            str2[Integer.parseInt(String.valueOf(temp.charAt(temp.length()-1)))-1]
                = str[i];
        }
        String res = Arrays.toString(str2);
        res = res.replaceAll("[^a-zA-Z ]","");
        return res;
    }
}