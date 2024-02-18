class Solution {
    public int maxProfit(int[] prices) {
        
        int overall_max_profit=0;
        
        int aab_taak_ka_min=prices[0];
        
        for(int sell=1; sell<prices.length;sell++){
            
            int curr_profit= prices[sell]-aab_taak_ka_min;
            overall_max_profit= Math.max(curr_profit, overall_max_profit);
            
            aab_taak_ka_min= Math.min(aab_taak_ka_min, prices[sell]);
        }
        
        return overall_max_profit;
        
    }
}
