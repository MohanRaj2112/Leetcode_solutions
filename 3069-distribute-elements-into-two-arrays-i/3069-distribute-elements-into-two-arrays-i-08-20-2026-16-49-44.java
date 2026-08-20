class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> li = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        li.add(nums[0]);
        l2.add(nums[1]);

        int n = nums.length;

        for(int i = 2; i < n; i++){
            if(li.get(li.size() - 1) > l2.get(l2.size() - 1)){
                li.add(nums[i]);
            }
            else{
                l2.add(nums[i]);
            }

        }
        int[] fin = new int[n];
        int id = 0;
        for(int i = 0; i < li.size() ; i++){
            fin[id++] = li.get(i);

        }
         for(int i = 0; i < l2.size() ; i++){
            fin[id++] = l2.get(i);

        }
        return fin;
        
    }
}