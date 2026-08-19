class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] stringToChar = strs[i].toCharArray();
            Arrays.sort(stringToChar);
            map.computeIfAbsent(new String(stringToChar), x -> new ArrayList<>()).add(strs[i]);
        }
        for(Map.Entry x : map.entrySet()){
            List<String> values = (List)x.getValue();
            result.add(values);
        }
        return result;
    }
}
