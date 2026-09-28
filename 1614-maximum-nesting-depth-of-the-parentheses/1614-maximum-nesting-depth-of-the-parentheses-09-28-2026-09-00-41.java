class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
           
            
            if(ch == '('){
                count++;
                if(max <  count){
                    max = count;
                }
                
            }
            
            else if(ch == ')'){
                count--;
            }
           
        }
        // if(count == 0){
        //     max = 0;
        // }
        return max;


        
    }
}