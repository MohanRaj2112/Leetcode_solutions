class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        int max = Integer.MIN_VALUE;

        Map<Integer,Integer> map = new HashMap<>();
        //boolean l = false;

        for(int i = 0; i <= n - k; i++){

        Set<Integer> set = new HashSet<>();
        
            for(int j = i; j < i+k; j++){

                set.add(nums[j]);
            }

            for(int num : set){

              map.put(num , map.getOrDefault(num , 0) +1);
            }


              
        }
       
        for(int num : map.keySet()){
            
             int m = map.get(num);
        
            if(m == 1){
                max = Math.max(num , max);
            }

           
           
        }
        if(max == Integer.MIN_VALUE){
            return -1;
        }
        
        else{
            return max;
        }

        
    }

}