class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((matrix[mid][0] <= target && mid + 1 == matrix.length) || (matrix[mid][0] <= target && matrix[mid + 1][0] > target)) {
                int L = 0;
                int R = matrix[mid].length - 1;
                while (L <= R) {
                    int M = (L + R) / 2;
                    if (matrix[mid][M] == target)
                        return true;
                    if (matrix[mid][M] < target) {
                        L = M + 1;
                    } else {
                        R = M - 1;
                    }
                }
            }

            if (matrix[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(row);
        return false;
    }
}
