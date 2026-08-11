class Solution {
    public int findKthPositive(int[] arr, int k) {

        int n = arr.length;

        int val = 0;

        Set<Integer> set = new HashSet<>();

        int max = 0;

        for(int num : arr)
        {
            set.add(num);
            max = Math.max(num, max);
        }

        int fin = 0;

         for(int i = 1; i <= max; i++)
        {
               if(!set.contains(i)){
                val++;
               }
               
               if(val == k){
                return i;
               }

        }
        return n+k;
        




        
    }
}