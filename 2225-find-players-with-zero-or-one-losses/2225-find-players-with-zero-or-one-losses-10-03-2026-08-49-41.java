class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> fin = new ArrayList<>();

        int n = matches.length;
        int m = matches[0].length;

        Map<Integer,Integer> win = new HashMap<>();

        Map<Integer,Integer> los = new HashMap<>();
        


        for(int i = 0; i < n; i++){
          
                int val = matches[i][0];
                int val2 = matches[i][1];

                win.put(val , win.getOrDefault(val , 0)+1);

                los.put(val2 , los.getOrDefault(val2 , 0)+1);

            
        }

        List<Integer> w = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        for(int num : win.keySet()){
            if(!los.containsKey(num)){
                w.add(num);
            }
        }
        for(int num : los.keySet()){
            int value = los.get(num);
            if(value == 1){
                l.add(num);
            }
        }
        Collections.sort(w);
        Collections.sort(l);

       fin.add(w);
       fin.add(l);
       return fin; /// first attempt 💯✅




    }
}