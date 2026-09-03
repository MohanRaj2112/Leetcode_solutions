class Solution {
    public int findClosest(int x, int y, int z) {
        int left = Math.abs(x - z);

        int right = Math.abs(y - z);

        if(left < right){
            return 1;
        }
        else if(left > right){
            return 2;
        }
        
        return 0;
    }
}