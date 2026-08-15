class Solution {
    public int minimumIndex(int[] capacity, int item) {
        
        int n = capacity.length;
        int min = Integer.MAX_VALUE;
        for(int i =0; i < n; i++){
            
            if(capacity[i] == item){
               return i;
            
            }
            

        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(capacity[i] >= item){
            count  = capacity[i] - item;
            min = Math.min(count , min);
            
            }
        }
        int k = 0;
        for(int i = 0; i < n; i++){
            k = capacity[i] - item;
            if(min == k){
                return i;
            }
            
        }
        return -1;
       
    }
}
      