class Solution {
    public boolean canAliceWin(int n) {

        int s = 10;
        boolean k = true;

        while(n >= s){
            n = n - s;
            s--;
            k = !k;


        }
    return !k;



        
        
        
    }
}