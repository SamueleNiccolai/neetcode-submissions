class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String target = strs[i];
            char[] charArray = target.toCharArray();
            Arrays.sort(charArray);
            map.computeIfAbsent(String.valueOf(charArray), x -> new ArrayList<>()).add(target);
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
