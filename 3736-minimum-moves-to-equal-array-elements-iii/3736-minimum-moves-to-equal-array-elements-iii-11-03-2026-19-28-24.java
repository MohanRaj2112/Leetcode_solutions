class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int num :  nums){
            max = Math.max(num , max);

        }
        int total = 0;
        for(int m : nums){
            total += Math.abs(max - m);
        }
        return total;
        
    }
}