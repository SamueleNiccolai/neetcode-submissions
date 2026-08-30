class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int root = nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (root + nums[start] + nums[end] == 0) {
                    result.add(List.of(root, nums[start], nums[end]));
                    start++;
                    continue;
                }
                if (nums[end] > 0 - nums[start] - root) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
