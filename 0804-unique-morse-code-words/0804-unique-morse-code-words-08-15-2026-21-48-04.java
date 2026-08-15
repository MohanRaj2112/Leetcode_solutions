class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String mos[] = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> set = new HashSet<>();
        
        for(String num : words){
            StringBuilder sb = new StringBuilder();

            for(char a : num.toCharArray()){
                sb.append(mos[a - 'a']);
            }
            set.add(sb.toString());



        }
        return set.size();
    }
}