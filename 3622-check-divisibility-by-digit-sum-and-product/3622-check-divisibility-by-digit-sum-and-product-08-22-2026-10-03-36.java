class Solution {
    public boolean checkDivisibility(int n) {

        int dummy = n;

        int sum = 0;

        int pro = 1;
       boolean k = false;

        while(n != 0){
            int dig = n % 10;

            sum = sum + dig;

            pro = pro * dig;

            n = n / 10;

        }

         int tot = sum + pro ;
    

        if(dummy % tot == 0){
            k =  true;
        
        }
        else{
            k = false;
        }

        return k;
        
        
    }
}