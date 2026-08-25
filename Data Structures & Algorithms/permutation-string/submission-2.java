class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (n > s2.length()) return false;

        Map<Character, Integer> need = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        for (int end = 0; end < s2.length(); end++) {
            char inChar = s2.charAt(end);
            window.put(inChar, window.getOrDefault(inChar, 0) + 1);

            int start = end - n + 1;
            if (start > 0) {
                char outChar = s2.charAt(start - 1);
                window.put(outChar, window.get(outChar) - 1);
                if (window.get(outChar) == 0) {
                    window.remove(outChar);
                }
            }

            if (start >= 0 && window.equals(need)) {
                return true;
            }
        }
        return false;
    }
}