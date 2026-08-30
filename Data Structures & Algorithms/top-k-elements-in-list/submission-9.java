class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*  il modo greedy potrebbe essere quello di usare
         *   una treeMap dover per ogni valore conto le occorrenze
         *   e poi restituire le k chiavi con piu occorrenze.
         *   Altra cosa che possiamo fare è costruire una lista che verra
         *   al piu di lunghezza nums.length + 1;
         *   La posizione i corrisponde al numero di occorrenze e la lista
         *   in quella posizione sono i valore che occorrone i volte.
         *   in ogni caso devo passare prima da una mappa prima.
         *   solo che nel caso di treemap ritornare k elementi
         *   costa piu che O(1)
         */

        int[] result = new int[k];
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }
        int position = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).isEmpty())
                continue;
            else {
                for(int j=0; j < list.get(i).size(); j++){
                    result[position] = list.get(i).get(j);
                    position++;
                    if(position == k) break;
                }
            }
            if(position == k) break;
        }
        return result;
    }
}
