class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int i = 0;
        int len = nums.length;
        Arrays.sort(nums);
        System.out.printf("Sorted nums: %s \n", Arrays.toString(nums));
        while (i < len - 2) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    List<Integer> list = List.of(nums[i], nums[j], nums[k]);
                    result.add(list);
                }
                if(nums[j] + nums[k] < 0 -nums[i])
                    j++;
                else
                    k--;
            }
            i++;
        }
        return new ArrayList<>(result);
    }
}
