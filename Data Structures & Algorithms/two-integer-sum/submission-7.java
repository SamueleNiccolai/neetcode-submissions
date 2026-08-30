class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Dato che ogni input ha esattamente una solo coppia i,j
        // che sommati fanno target possiamo usare una mappa <Valore,Indice>
        // e in passo i di un ciclo, prima di inserire nella mappa controllare
        // se esisten gia il delta che mi farebbe raggiungere target o no
        // In pratica a ogni step cerco in mappa target - nums[i].
        // cosa succede se "You may assume that every input has exactly one pair
        // of indices i and j that satisfy the condition." viene meno e devo
        // restituire tutte le coppie?
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (map.containsKey(delta)) {
                result[0] = map.get(delta);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
