class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;

        for (int i = 0 ; i< prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxPro){
                maxPro = profit;
            }
        }

        return maxPro;


        
    }
}