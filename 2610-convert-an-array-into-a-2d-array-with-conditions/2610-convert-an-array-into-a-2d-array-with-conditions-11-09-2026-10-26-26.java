class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
        }

        List<List<Integer>> fin = new ArrayList<>();

        while(!map.isEmpty()){

            List<Integer> list = new ArrayList<>();
            
            Iterator<Integer> it = map.keySet().iterator();

           while(it.hasNext()){
                int num = it.next();

                list.add(num);

                map.put(num, map.get(num) - 1);

                if(map.get(num) == 0){
                    it.remove();
                }
            }
            
            fin.add(list);


        }
        return fin;
        
    }
}