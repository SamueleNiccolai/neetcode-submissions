class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int start = 0;
        int end = heights.length - 1;
        while (start < end) {
            int l = end - start;
            int h = Math.min(heights[start], heights[end]);
            result = Math.max(result, l * h);
            if (heights[start] < heights[end])
                start++;
            else
                end--;
        }
        return result;
    }
}
