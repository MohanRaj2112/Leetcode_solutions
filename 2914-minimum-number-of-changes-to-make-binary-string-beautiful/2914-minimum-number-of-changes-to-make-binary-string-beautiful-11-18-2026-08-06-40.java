class Solution {
    public int minChanges(String s) {
    
    int n = s.length();

    // Map<Character,Integer> map = new HashMap<>();

    // for(char ch : s.toCharArray()){
    //     map.put(ch , map.getOrDefault(ch , 0) +1);
    // }

    // int min = Integer.MAX_VALUE;
    // for(int num : map.values()){
    //     if(min > num){
    //         min = num;        }
    // }
    // if(min == n){
    //     return 0;
    // }
    // return min;              248 / 577;

    int count = 0;

    for(int i = 0; i < n-1; i+=2){
        if(s.charAt(i) != s.charAt(i+1)){
            count++;
        }
    }
    return count;                    /// ✅💯
    


    }
}