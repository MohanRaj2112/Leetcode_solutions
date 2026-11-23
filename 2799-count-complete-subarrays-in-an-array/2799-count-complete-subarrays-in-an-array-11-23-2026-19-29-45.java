class Solution {

    public int countCompleteSubarrays(int[] nums) {

        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        Map<Integer,Integer> map = new HashMap<>(); 

        for(int num : nums){
           set.add(num);
        }

        int m = set.size(); 
        
        int count = 0;
        int l = 0;

        for(int i = 0; i < n; i++){  
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);

            while(map.size() == m){
                count+= n - i;
                map.put(nums[l] , map.getOrDefault(nums[l] , 0) -1);

                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;


                
            }


  
        }
        return count;

        
    }
}