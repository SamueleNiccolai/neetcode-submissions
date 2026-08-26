class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.printf("start: %s, end: %s, mid: %s\n", start, end, mid);
            int guess = nums[mid];
            if (guess == target)
                return mid;
            if (guess < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
