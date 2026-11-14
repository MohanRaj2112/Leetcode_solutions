// class Solution {
//     public int minimumSumSubarray(List<Integer> list, int l, int r) {
//         int n  = list.size();

//         int min = Integer.MAX_VALUE;
//         int sum = 0;

//         for(int i = 0; i < l; i++){
//             sum += list.get(i);
//         }

//         for(int i = l ; i < n; i++){
//             if(sum > 0){
//                            min = Math.min(min , sum);
//             }
            

//             sum = sum + list.get(i) - list.get(i - l); 
//         }
//        if(min == Integer.MAX_VALUE){
//             return -1;
//        }
//        else{
//         return min;
//        }
        
//     }
// }


  class Solution {
    public int minimumSumSubarray(List<Integer> list, int l, int r) {

        int n = list.size();

        int min = Integer.MAX_VALUE;

        int[] prefix = new int[n + 1];


        for(int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + list.get(i);
        }
       for(int k = l; k <= r; k++) {

            for(int i = 0; i + k <= n; i++) {

                int sum = prefix[i + k] - prefix[i];

                if(sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}