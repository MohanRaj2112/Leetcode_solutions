class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int m = nums2.length;

        int[] arr = new int[2];
    

    Map<Integer,Integer> map = new HashMap<>();

    for(int num : nums1){
        map.put(num , map.getOrDefault(num , 0) +1);
      }


    Map<Integer,Integer> map1 = new HashMap<>();

    for(int num : nums2){
        map1.put(num , map1.getOrDefault(num , 0) +1);
      }

      int cnt1 = 0;
      int cnt2 = 0;

      for(int num : map.keySet()){
        if(map1.containsKey(num)){
           cnt1 += map.get(num);
        }
      }

       for(int num : map1.keySet()){
        if(map.containsKey(num)){
            cnt2+= map1.get(num);
        }
      }
      arr[0] = cnt1;
      arr[1] = cnt2;
      return arr;
    }
}
