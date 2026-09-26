class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> map = new HashMap<>();

        for(List<String> pair : knowledge){
            map.put(pair.get(0) , pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int n = s.length();
        String k ="";

        while(i < n){
            if(s.charAt(i) == '('){
                j = i + 1;

                while(s.charAt(j) != ')' && j < n){
                    k = k + s.charAt(j);
                    j++;

                }
                i = j + 1;
                if(map.containsKey(k)){
                    String val = map.get(k);
                    sb.append(val);
                }
                else{
                    sb.append("?");
                }
                k ="";
            }
            else if(s.charAt(i) != ')'){
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
         
        
    }
}