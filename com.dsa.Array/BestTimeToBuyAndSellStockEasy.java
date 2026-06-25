class BestTimeToBuyAndSellStockEasy {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxSoFar=0;
        for(int i=1;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
                continue;
            }
            maxSoFar=Math.max(maxSoFar,prices[i]-minPrice);
        }
        return maxSoFar;
    }
}