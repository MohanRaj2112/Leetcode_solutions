class Solution {
    public int finalValueAfterOperations(String[] operations) {


     int x = 0;

        for(String num : operations){
            String k = num;

            for(int i =0; i < k.length()-1; i++){
                if(k.charAt(i) == '+'&& k.charAt(i+1) == '+'){
                    x = x + 1;
                  
                }
                else if(k.charAt(i) == '-' && k.charAt(i+1) == '-'){
                    x = x - 1;

                }

            }
        }
            return x;

            



        }
        
    }
