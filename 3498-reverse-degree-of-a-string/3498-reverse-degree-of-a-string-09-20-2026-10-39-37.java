class Solution {
    public int reverseDegree(String s) {
    
       int sum = 0;

      for (int i = 0; i < s.length(); i++) 
      {
         int normalPos = s.charAt(i) - 'a' + 1;
         int reversePos = 27 - normalPos;
         sum += reversePos * (i + 1); 
      }
      return sum;
        
        
    }
}