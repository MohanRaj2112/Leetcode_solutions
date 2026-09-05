class Solution {
    public int reverse(int num){
        int val = num;
        int fin = 0;

        while(val != 0)
        {
            int rev = val % 10;
            fin = fin * 10 + rev;
            val /= 10;
        }
        return fin;
    }


    public int countNicePairs(int[] nums) {
        long count  = 0;
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            int key = num - reverse(num);
            count += map.getOrDefault(key , 0);

            map.put(key, map.getOrDefault(key , 0)+1);


        }

        // for(int i = 0; i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(i != j)
        //         {
        //             int l = reverse(nums[i]) + nums[j];
        //             int r = nums[i] + reverse(nums[j]);
        //             if(l == r)
        //             {
        //                 count++;
        //             }


        //         }

        //     }
        // }
        return (int)(count % 1000000007);


        
    }
}