class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit =0;
      int cp = prices[0];


      for(int i =1;i<prices.length;i++)
        {
            cp = Math.min(cp,prices[i]);

            int profit = prices[i]-cp;

            if(maxProfit<profit){
                maxProfit= profit;
            }
        }

        return maxProfit;
    }
}







/*

  int n =prices.length;
        int cp = prices[0];
        
        int maxProfit = 0;
        for(int i =1;i<n;i++){
            
            
            cp = Math.min(cp,prices[i]);

            int profit = prices[i] - cp;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;


int n = prices.length;
        int maxProfit =0;
        int cp = prices[0];
        for(int i =1;i<n;i++){
            cp = Math.min(cp,prices[i]);
            int profit = prices[i]-cp;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
 */
