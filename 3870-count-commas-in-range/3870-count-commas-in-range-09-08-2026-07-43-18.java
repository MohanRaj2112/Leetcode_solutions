class Solution {
    public int countCommas(int n) {

        int dummy = n;

        if(n < 1000){
            return 0;
        }


        int count = 0;
        while(n != 0){
             count++;
            int rev = n % 10;
           
            n = n / 10;
        }
        int ran = (count-1) / 3;
       
        return (ran *(dummy + 1) - 1000);
    }
}