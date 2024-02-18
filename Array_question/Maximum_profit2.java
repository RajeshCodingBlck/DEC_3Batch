class Solution {
    public int maxProfit(int[] prices) {
        
       int overall_max_profit=0;  
      for(int buy=0; buy<prices.length; buy++){
          
          for(int sell=buy+1;sell<prices.length;sell++){
              
             // System.out.println(buy+ " "+sell);
              
              int curr_profit= prices[sell]-prices[buy];
               System.out.println(buy+ " "+sell+ " "+ curr_profit);
              overall_max_profit= Math.max(overall_max_profit, curr_profit);
              
          }
      }
        
        return overall_max_profit;
    }
}
