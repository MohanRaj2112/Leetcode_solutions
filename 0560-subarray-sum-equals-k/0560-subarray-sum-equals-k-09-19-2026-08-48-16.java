class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                count += nums[j];
                if(count == k){
                    cnt++;

                }

            }
        }
        return cnt;
        
    }
}