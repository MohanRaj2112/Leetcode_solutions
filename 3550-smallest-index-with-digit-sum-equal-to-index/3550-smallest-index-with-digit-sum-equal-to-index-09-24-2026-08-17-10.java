class Solution {
     
     public int digit(int num){
        int val = num;
        int count = 0;

        while(val != 0){
            int rev = val % 10;
            count += rev;
            val /= 10;
        }
        return count;


     }

    public int smallestIndex(int[] nums) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;

        for(int i =0; i < n; i++){

            int total = digit(nums[i]);
            if(i == total){
                min = Math.min(i , min);
            }

        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;


        
    }
}