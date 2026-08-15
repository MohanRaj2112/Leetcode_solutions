class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();


        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int count = 0;

        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))){
                count++;
            }

        }
      int max = count;
        int left = 0;

        for(int j = k; j < n; j++){

             if(set.contains(s.charAt(j)))
            {
                count++;
            }
               if(set.contains(s.charAt(left)))
            {
                count--;
            }
            left++;



             max = Math.max(max , count);

        }
        return max;

        
    }
}