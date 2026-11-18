class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            sum += nums[i];

            while(sum >= target){
                min = Math.min(min , (i - l) + 1);

                sum -= nums[l];
                l++;

            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }



      
}
}