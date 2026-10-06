class Solution {
    public int minAddToMakeValid(String s) {

        int n = s.length();
        int c = 0;
        int r = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                c++;
                
            }
            else{
                if(c > 0){
                          c--;
                }
                else{
                    r++;
                }
                
            }
        }
        return c + r;
        
    }
}