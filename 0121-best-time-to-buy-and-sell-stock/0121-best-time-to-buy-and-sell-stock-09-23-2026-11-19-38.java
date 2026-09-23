class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = prices[0];
       
        // for(int i = 0; i < n; i++){
        //      int sum = 0;
        //     for(int j = i+1; j < n; j++){
        //         if(prices[i] < prices[j]){
        //             sum = (prices[j] - prices[i]);
        //             max = Math.max(sum , max);
        //         }
        //     }                                                                   200 / 213

        // int index = 0;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i < n; i++){
        //     if(prices[i] <  min){
        //         min = prices[i];
        //         index = i;
        //     }    
        // }
        // for(int i = index ; i < n; i++)
        // {
        //    if(max < prices[i]){
        //        max = prices[i];
        //     }

        // }
        // if((max - min) < 0){
        //     return 0;
        // }
        
        // return max - min;                153 / 213

       int sum = 0;
       int pro = 0;

         for(int j = 1; j < n; j++){
                if(prices[j] < max){
                    max = prices[j];
                }
                    sum = (prices[j] - max);
                    pro = Math.max(sum , pro);
                }

            return pro; 

        
    }
}