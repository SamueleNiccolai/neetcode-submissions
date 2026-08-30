class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            while (!Character.isLetterOrDigit(s.charAt(start))) {
                if(start >= end) break;
                start++;
            }
            while (!Character.isLetterOrDigit(s.charAt(end))) {
                if(end <= start) break;
                end--;
            }
            System.out.printf(
                "s.charAt(start): %s,s.charAt(end):%s\n", s.charAt(start), s.charAt(end));
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
