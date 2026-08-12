class Solution {
    public boolean isArraySpecial(int[] nums) {
       
       int n = nums.length;

        if(n == 1){
            return true;
        }
        boolean k = true;;
        for(int i = 1; i < n;i++){
            if((nums[i-1] + nums[i]) % 2 != 1){
                k = false;
                break;
            }

        }
        return k;
        
    }
}