

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here =
         
         int [][] dp= new int[n][W+1];
         
         for(int i=0; i<n;i++){
             
             for(int j=0; j<=W;j++){
                 
                if(j==0){
                    
                    dp[i][j]=0;
                }else if(i==0){
                    
                    if(j>=wt[i]){
                        dp[i][j]=val[i];
                    }else{
                        dp[i][j]=0;
                    }
                }else{
                    dp[i][j]=dp[i-1][j];
                    if(j>=wt[i]){
                        
                        dp[i][j]= Math.max(dp[i][j], val[i]+dp[i-1][j-wt[i]]);
                        
                    }
                }
             }
         }
         
         return dp[n-1][W];
    } 
}
