class Solution {
    public int[] dailyTemperatures(int[] arr) {

        int n = arr.length;
        int[] dup = new int[n];
        Arrays.fill(dup , 0);

        int top = 0;
      

        // while( top < n  ){
        //          int ind = top + 1;

        //   while(ind < n){

        //         if(arr[top] < arr[ind]){

        //             dup[top] = Math.abs(ind - top);
        //             break;

        //          }
        //          ind++;
                  
        //         }

        //         top++;

        //     }       47 / 48;


        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){

                int k = stack.pop();
                dup[k] = i - k;

            }
            stack.push(i);
        }



            
        
        return dup;
        
    }
}