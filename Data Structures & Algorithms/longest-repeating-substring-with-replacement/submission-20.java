class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int start = 0;
        int end = 0;
        // window valida winLen - charConPiuOcc <= k;
        while (end < s.length()) {
            int winLen = end - start + 1;
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            if (winLen - getMaxOcc(map) <= k) {
                result = Math.max(result, winLen);
                end++;
            } else {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 1) - 1);
                start++;
            }
        }
        return result;
    }

    public int getMaxOcc(Map<Character, Integer> map) {
        if (map == null || map.isEmpty())
            return 0;
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }
}
