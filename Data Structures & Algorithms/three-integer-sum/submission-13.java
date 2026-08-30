class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i!= 0 && nums[i] == nums[i-1]) continue;
            int root = nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (root + nums[start] + nums[end] == 0) {
                    result.add(List.of(root, nums[start], nums[end]));
                    start++;
                    end--;
                    while (start <= end && nums[start] == nums[start - 1]) start++;
                    while (end > start && nums[end] == nums[end +1]) end--;
                    continue;
                }
                if (nums[end] > 0 - nums[start] - root) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }
}
