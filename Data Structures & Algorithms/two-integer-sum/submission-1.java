class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int delta = target-nums[i];
            if(map.containsKey(delta)){
                result[0] = map.get(delta);
                result[1] = i;
                break;
            }
            if(!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        return result;
    }
}
