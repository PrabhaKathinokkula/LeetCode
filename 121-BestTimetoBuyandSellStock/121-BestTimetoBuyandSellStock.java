// Last updated: 5/28/2026, 5:19:37 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=prices[0];
4        int maxprofit=0;
5        for(int i=1;i<prices.length;i++){
6            int profit = prices[i]-min;
7            if(profit> maxprofit){
8               maxprofit=profit;
9
10            }
11            if(prices[i]<min){
12           min=prices[i];
13        }
14        }
15          return  maxprofit;
16        
17    }
18}