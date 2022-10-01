class Solution {
    public String defangIPaddr(String address) {
        int n = address.length(),i=0;
        String newAdd = "";
        while(i<n){
            if(address.charAt(i) == '.'){
                newAdd += "[.]";
            } else{
                newAdd += address.charAt(i);
            }
            i++;
        }
        return newAdd;
    }
}