class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double count = 0;

        double val ;
        double max = 0;


        for(int i =0; i < k; i++){
            count += nums[i];
            
        }
         max = (double)(count / k);
        

         for(int i = k; i < n; i++){
             count -=nums[i - k];
             count +=nums[i];

              double ka = (double)(count / k);

             
              max = Math.max(max , ka);


         }
         return max;
        
        



        
        
    }
}