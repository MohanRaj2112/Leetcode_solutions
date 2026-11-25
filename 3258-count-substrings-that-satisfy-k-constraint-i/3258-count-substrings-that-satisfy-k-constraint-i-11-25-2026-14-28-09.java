class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int n = s.length();

        int count = 0;
        int zc = 0;
        int oc = 0;

     int l = 0;


        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                oc++;
            }
            else{
                zc++;
            }

            while(zc > k && oc> k){
                if(s.charAt(l) == '1') oc--;
                else zc--;
                l++;

            }
            count += i - l +1;
            
            }



        
        return count;
        
    }
}