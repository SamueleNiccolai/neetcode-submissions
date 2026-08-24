public class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
		// trovo i caratteri distinti
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

		// per ogni carattere
        for (char c : charSet) {
            int count = 0, l = 0;
			// scorro l'array con il puntato R e conto le occorrenze di char nella window
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == c) {
                    count++;
                }
				// fino a quando la stringa non è valida scorro il puntatore L e decremento i count corrispondenti
                while ((r - l + 1) - count > k) {
                    if (s.charAt(l) == c) {
                        count--;
                    }
                    l++;
                }
				// aggiorno la lunghezza
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}