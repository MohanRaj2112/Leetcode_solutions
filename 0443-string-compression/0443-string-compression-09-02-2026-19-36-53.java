class Solution {
    public int compress(char[] chars) {
       
         String s = "";

        for(char ch : chars){
            s = s + ch;
        }
        
        int n = s.length();

        int count = 1;

        StringBuilder sb = new StringBuilder();

        int id = 0;

        


            for(int j = 1; j < n; j++)
            {
                
              
                if(s.charAt(j-1) == s.charAt(j))
                {
                    count++;
                }

                else{
                        sb.append(s.charAt(id));
                    if(count > 1){

                        sb.append(count);
                     

                    }   
                      id = j;
                       count = 1;
                    
                }
               
            }

                  sb.append(s.charAt(id));
                    if(count > 1){

                        sb.append(count);
                    }

                   for (int i = 0; i < sb.length(); i++) {
                           chars[i] = sb.charAt(i);
                 }

                    return sb.length();
                     
        
        

    }
}
       