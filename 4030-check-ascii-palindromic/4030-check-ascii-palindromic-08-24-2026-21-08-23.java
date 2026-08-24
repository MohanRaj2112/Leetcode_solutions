class Solution {
    public boolean isPalindromic(String s) {

        int n = s.length();

           String dum ="";

        for(int i =0; i < n; i++){

            char ch = s.charAt(i);

            int ascii = (int) ch;

           dum = dum + String.format("%8s", Integer.toBinaryString(ascii))  .replace(' ', '0');




        }

        int l = 0;

        int r = dum.length()-1;

      boolean k = true;

      while(l < r){
        if(dum.charAt(l) != dum.charAt(r)){
            k = false;
            break;
        }
        l++;
        r--;
      }
      return k;
        
    }
}