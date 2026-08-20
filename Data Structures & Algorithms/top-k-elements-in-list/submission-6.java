class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> elementsCount = new ArrayList<>();
        int[] result = new int[k];
        //Map{value, count}
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length + 1; i++) {
            elementsCount.add(i, new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            elementsCount.get(entry.getValue()).add(entry.getKey());
        }
        int count = 0;
        for(int j = elementsCount.size() - 1; j >= 0; j--){
            List<Integer> target = elementsCount.get(j);
            if(target.size() != 0) {
                for(int i = 0; i<target.size(); i++){
                    System.out.println(target.get(i));
                    result[count] = target.get(i);
                    count ++;
                }
                if(count == k) return result;
            }
        }
        return result;
    }
}
