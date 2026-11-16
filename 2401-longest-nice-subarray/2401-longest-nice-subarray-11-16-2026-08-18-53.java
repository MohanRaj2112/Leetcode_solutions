class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int count = 0;
            int m = 0;
            for(int j = i; j < n; j++){
                if((m & nums[j]) != 0){
                   break;
                }
                m = m | nums[j];
                 count++;
                
                max = Math.max(max, count);



            }
        }
        return max;
        
    }
}