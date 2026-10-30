class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> last = new ArrayList<>();

        Map<String, List<String>> map= new HashMap<>();


        for(String num : strs){
            char[] ch = num.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            map.get(key).add(num);
        }
        for(List<String> li: map.values()){
        last.add(li);
        }
        return last;
        

        

        

        
    }
}