class Solution {
    public int findNumbers(int[] nums) {

        int cnt = 0;

        for(int num : nums){
            int dig = 0;
            int cpy = num;

            while(cpy != 0){
                dig++;
                cpy /= 10;
            }
             if(dig % 2 == 0){
                cnt++;
            }
           


        }
        
        return cnt;
        
    }
}