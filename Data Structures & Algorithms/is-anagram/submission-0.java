class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // if size is different surely are different
        if(sArray.length != tArray.length) return false;
        Map<Character, Integer> map = new HashMap();
        for(int i=0; i< sArray.length; i++) {
            map.put(sArray[i], map.getOrDefault(sArray[i],0) + 1);
        }
        for(int i=0; i< tArray.length; i++){
            if(!map.containsKey(tArray[i])) return false;
            map.put(tArray[i], map.getOrDefault(tArray[i], 0) - 1);
            if(map.get(tArray[i]) == 0)
                map.remove(tArray[i]);
        }
        return true;
    }
}
