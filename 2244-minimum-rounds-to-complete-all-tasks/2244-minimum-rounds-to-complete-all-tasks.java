class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = tasks.length;
        
        for(int i=0 ; i<n; i++){
            if(!hm.containsKey(tasks[i])){
                hm.put(tasks[i], 1);
            } else {
                hm.put(tasks[i], hm.get(tasks[i])+1);
            }
        }
        int count = 0;
       
        for (Map.Entry<Integer, Integer> map :
             hm.entrySet()) {
            
            if(map.getValue() == 1){
                return -1;
            }
            
            if(map.getValue()%3 == 0){
                count += map.getValue()/3;
            } else {
                count += map.getValue()/3 + 1;
            }
        }
        return count;
    } 
}