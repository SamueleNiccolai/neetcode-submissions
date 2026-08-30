class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        int result = 1;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if(set.isEmpty() || !set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                result = Math.max(result,set.size());
            } else {
                while(start <= end && set.contains(s.charAt(end))){
                    set.remove(s.charAt(start));
                    start++;
                }
            }
        }
        return result;
    }
}
