class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int n = nums.length;

        int count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int k = nums[i];

            while(k != 0){
                int val = k % 10;
                map.put(val , map.getOrDefault(val , 0) +1);
                k = k / 10;
            }
        }
        for(int num : map.keySet()){
            if(num == digit){
                count = map.get(num);
            }
        }
        return count;
        
    }
}