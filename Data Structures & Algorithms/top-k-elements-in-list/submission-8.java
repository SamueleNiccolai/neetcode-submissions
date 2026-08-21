class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        List<List<Integer>> count = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(count);
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            count.add(new ArrayList<Integer>());
        }   
        count.add(new ArrayList<Integer>());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            count.get(entry.getValue()).add(entry.getKey());
        }
        int index = 0;
        for(int i = count.size() - 1; i >= 0; i--) {
            if(count.get(i).size() == 0) continue;
            for(Integer val : count.get(i)) {
                result[index] = val;
                index++;
                if(index == k) return result;
            }
        }
        return result;
    }
}
