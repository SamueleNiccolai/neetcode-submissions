class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = 0;
        int end = 0;
        while(end <= prices.length-1){
            if(start == end){
                end++;
                continue;
            }
            if(prices[end] >= prices[start]){
                profit = Math.max(profit, prices[end] - prices[start]);
                end++;
            } else {
                start = end;
                end++;
            }
        }
        return profit;
    }
}
