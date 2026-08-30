class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i<numbers.length; i++){
            int delta = target - numbers[i];
            int start = i + 1;
            int end = numbers.length - 1;
            while(start <= end){
                int mid = (end + start) / 2;
                if(numbers[mid] == delta) {
                    result[0] = i + 1;
                    result[1] = mid + 1;
                    return result;
                }
                if(numbers[mid] < delta){
                    start = mid + 1;
                } else {
                    end = mid-1;
                }
            }
        }
        return result;
    }
}
