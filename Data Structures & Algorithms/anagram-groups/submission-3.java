class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*  L'idea è di costruire una Map<String,List<String>>
         *   La chiave deve essere la stessa per tutti gli anagrammi
         *   poi si ciclano le entry di map e si aggiungono i valori al risultato
         *   Complessita O(n) per essere piu precisi O(n*m)
         *   - dove n è la length di strs
         *   - m il numero di chiavi
         *   La difficolta diventa costruire la chiave equivalente per gli array
         *   2 modi
         *   - sorto gli array come chiave
         *       - la complessita totale sarebbe O(nLogn*m)
         *   - a ogni ciclo costruire un array[26] contare le occorrenze
         *         e usare l'array come string come chiave si ritorna O(n*m)
         */
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        // costruisco la mappa
        // e a ogni iterazione aggiungo una lista vuota a result
        for (int i = 0; i < strs.length; i++) {
            String target = strs[i];
            int[] occorrenze = new int[26];
            for (char c : target.toCharArray()) occorrenze[c - 'a']++;
            String key = Arrays.toString(occorrenze);
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(target);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
