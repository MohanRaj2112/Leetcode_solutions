class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //  int l = 0;
        //  int r = n-1;

        int k = 0;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                k = num;
                break;
            }
        }
        return k;

    }
}