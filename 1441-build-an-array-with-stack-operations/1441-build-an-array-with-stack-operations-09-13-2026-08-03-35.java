class Solution {
   
    public List<String> buildArray(int[] target, int n) {
   
  
     int[] arr = new int[n];

     int m = target.length;

     List<String> li = new ArrayList<>();

         int top = 0;

        for(int i = 1 ; i <= n; i++){
           
        if(top < m){
             li.add("Push");
       
        if(i == target[top])
        {
           top++;
        }
        else
        {
            li.add("Pop");
            
        }
        }
        else{
            break;
        }
        }

        return li;

        
        
    }
}