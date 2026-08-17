class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int cnt = 0;

        Set<Character> set = new HashSet<>();
        for (char h : allowed.toCharArray()) {
            set.add(h);

        }

        for (String num : words) {
            boolean k = true;
            for (char ch : num.toCharArray()) {
                if (!set.contains(ch)) {
                    k = false;
                    break;
                }
            }
            if (k) {
                cnt++;
            }

        }
        return cnt;

    }
}