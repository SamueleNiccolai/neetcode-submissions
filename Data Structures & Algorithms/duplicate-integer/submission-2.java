class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            map.put(target, map.getOrDefault(target, 0) + 1);
            if (map.containsKey(target) && map.get(target) > 1) {
                return true;
            }
        }
        return false;
    }
}