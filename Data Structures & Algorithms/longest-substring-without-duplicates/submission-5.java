class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 1;
        int maxLength = 1;
        set.add(s.charAt(start));
        while (end < s.length()) {
            if (set.contains(s.charAt(end))) {
                maxLength = Math.max(maxLength, end - start);
                set.remove(s.charAt(start));
                start++;
            } else {
                maxLength = Math.max(maxLength, end - start + 1);
                set.add(s.charAt(end));
                end++;
            }
        }
        return maxLength;
    }
}
