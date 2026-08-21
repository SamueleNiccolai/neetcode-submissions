class Solution {
    public boolean isAnagram(String s, String t) {
        System.out.println(s.toCharArray().length);
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if(sArray.length != tArray.length) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(sArray[i], map.getOrDefault(sArray[i], 0) + 1);
            map.put(tArray[i], map.getOrDefault(tArray[i], 0) - 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() < 0) return false;
        }
        return true;
    }
}
