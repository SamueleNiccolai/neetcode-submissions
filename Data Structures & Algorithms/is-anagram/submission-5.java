class Solution {
    public boolean isAnagram(String s, String t) {
        /***
         * se s e t hanno lengt() diversa sicuramente non sono un anagramma
         * 3 Modi:
         * - Sorto le stringhe e poi controllo se sono uguali -> C: O(nlogn), S: O(1)? non so se il
         * sorting dichiara una struttura n di appoggio o no
         * - Faccio una mappa <Carattere, Occorrenze> dove aggiungo i caratteri
         *   della prima stringa e sottraggo i caratteri della seconda.
         *   una volta sottratto se trovo un carattere con occorrenza != 0
         *   allora non è un anagramma. -> C: O(n), S:O(n)
         * - s e t contengono solo lettere dell'alfabeto inglese in minuscolo
         *   quindi posso dichiarare 2 array di lunghezza 26 contare le occorrenze
         *   e poi controllare se gli array sono uguali. C: O(n), S:O(1)
         */
        if (s.length() != t.length())
            return false;
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a1[s.charAt(i)-'a']++;
            a2[t.charAt(i)-'a']++;
        }
        return Arrays.equals(a1,a2);
    }
}
