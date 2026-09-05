class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n = nums.length;

        // int max = Integer.MIN_VALUE;
        // int id = 0;

        // for(int i = 0; i < n; i++){
        //     max = Math.max(max, nums[i]);
        //     int min = Integer.MAX_VALUE;

        //     for(int j = i; j < n; j++){
        //         if(nums[j] < min){
        //             min = nums[j];
        //             id = i;
        //         }


        //     }
        //     if(max - min <= k){
        //         return id;
        //     }

        // }
        // return -1;


        int[] arr = new int[n];

        arr[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i--){
            arr[i] = Math.min(nums[i] , arr[i + 1]);
        }

        int max = arr[0];

        for(int i = 0; i < n; i++){
            max = Math.max(nums[i] , max);

            int fin = max - arr[i];
            if(fin <= k){
                return i;
            }
        }
        return -1;

    }
}