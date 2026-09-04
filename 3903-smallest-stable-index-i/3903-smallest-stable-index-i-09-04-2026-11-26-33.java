class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        int max = 0;
        int l = 0;
        
        
    
        for(int i = 0; i < n; i++)
        {
              max = Math.max(max , nums[i]);
               int min = Integer.MAX_VALUE;
           
             
          for(int j = i; j < n;j++){
           if(min > nums[j]){
            min = nums[j];
            l = i;
           }
           
            }
             if(max - min <= k)
                {
                 return l;
                } 
        }

       return -1;
        
    }
}