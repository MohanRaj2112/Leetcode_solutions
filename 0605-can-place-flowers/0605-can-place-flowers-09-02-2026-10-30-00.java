class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int k = arr.length;
        int dum = n;

        if(n == 0){
            return true;
        }
        for(int i = 0; i < k; i++){
            if(arr[i] == 0){
                boolean left = ((i == 0) || (arr[i-1] == 0));
                boolean right = ((i == k-1) || (arr[i+1] == 0));
                if(left && right){
                    arr[i] = 1;
                    dum--;

                    if(dum == 0){
                        return true;
                    }
                }
            }
        }
       

        
        return false;
        


        
    }
}