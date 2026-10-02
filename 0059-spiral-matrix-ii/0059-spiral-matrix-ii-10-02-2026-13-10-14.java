class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int rl = arr.length;
        int cl = arr[0].length;


        int l = 0;
        int r = rl - 1;

        int top = 0;
        int bot = cl - 1;

        int k = 1;


        while(l <= r && top <= bot){

            for(int i = l; i <= r; i++){
                arr[top][i] = k;
                k++;
            }
            top++;

            for(int i = top; i <= bot ; i++){
                arr[i][r] = k;
                k++;
            }
            r--;

            for(int i = r; i >= l; i--){
                arr[bot][i] = k;
                k++;
            }
            bot--;

            for(int i = bot ; i>= top ; i--){
                arr[i][l] = k++;
            }
            l++;
        }
        return arr;


        
    }
}