class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int base = 1;
        
        int max = 0;
        for(int i = 0; i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        // il numero di ore puo andare da un minimo di piles.length se k = max value
        // a un massimo equivalente al prodotto di tutti i elementi se k = 1;
        Integer minK = null;
        while (base <= max) {
            int k = (max + base) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                int resto = piles[i] % k == 0 ? 0 : 1;
                hours = hours + Math.max(1, piles[i] / k + resto);
            }
            if (hours > h) {
                base = k + 1;
            } else {
                max = k - 1;
                minK = minK != null ? Math.min(minK, k) : k;
            }
        }
        return minK;
    }
}
