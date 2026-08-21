class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        // String -> char[]
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // Sorting Array
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}
