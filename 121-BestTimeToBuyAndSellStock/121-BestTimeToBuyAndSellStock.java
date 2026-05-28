// Last updated: 5/28/2026, 5:20:02 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-min;
            if(profit> maxprofit){
               maxprofit=profit;

            }
            if(prices[i]<min){
           min=prices[i];
        }
        }
          return  maxprofit;
        
    }
}