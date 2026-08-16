class Solution {
    public boolean closeStrings(String word1, String word2) {

        Map<Character, Integer> map = new HashMap<>();

        Set<Character> set = new HashSet<>();
        
        Map<Character,Integer> map1 = new HashMap<>();

        if(word1.length() != word2.length()){
            return false;
        }


        for(char num : word2.toCharArray()){
           
            map1.put(num , map1.getOrDefault(num , 0) +1);
            set.add(num);
        }

        for(char num : word1.toCharArray()){
            map.put(num , map.getOrDefault(num , 0) +1);
             
        }

        boolean k = true;

        for(char val : map.keySet()){
            if(set.contains(val)){
                int moh = map.get(val);
                if(!map1.containsValue(moh)){

                    k = false; 
                }
                else{
                    map1.values().remove(moh);
                }

            }
            else{
              k = false;;
            }
        }
        return k;
    }
}