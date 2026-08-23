class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max = 0;
        int pointer = 1;
        int maxPrice = 0;
        while (pointer < prices.length) {
            if(prices[pointer] < prices[min]){
                min = pointer;
                max = pointer;
            }
            
            if (prices[pointer] > prices[max]){
                max = pointer;
            }
            maxPrice = Math.max(maxPrice, prices[max] - prices[min]);
            pointer++;
        }
        return maxPrice;
    }
}
