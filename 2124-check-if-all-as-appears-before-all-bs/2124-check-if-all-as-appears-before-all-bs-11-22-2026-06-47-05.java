class Solution {
    public boolean checkString(String s) {

        int n = s.length();
        char[] ch = s.toCharArray();
        
        boolean k = true;
        // for(int i = 0; i < n; i++){
        //         if(ch[i] == 'b'){
        //             for(int j = i+1; j < n; j++){
        //                 if(ch[j] == 'a'){
        //                     k = false;
        //                 }

        //             }

        //         }
        // }


        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
                return false;
            }
        }
        return true;
        
    }
}