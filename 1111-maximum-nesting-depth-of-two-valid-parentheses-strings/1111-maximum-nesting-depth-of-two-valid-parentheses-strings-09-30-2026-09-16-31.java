class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int n = seq.length();
        int[] arr = new int[n];

        int count = 0;
        int id = 0;

        for(char ch : seq.toCharArray()){
            if(ch == '('){
                count++;
                arr[id++] = count % 2;

                

            }
            else{
                arr[id++] = count % 2;
                count--;
            }
        }
        return arr;

        
 }
    
}