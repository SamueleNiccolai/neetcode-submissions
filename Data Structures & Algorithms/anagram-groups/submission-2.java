class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String target = strs[i];
            char[] count = new char[26];
            for(char c : target.toCharArray()) count[c - 'a']++;
            String key = Arrays.toString(count);
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(target);
        }
        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}
