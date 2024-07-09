class Solution {
    public int minDistance(String text1, String text2) {
        
         int n= text1.length();
      int m= text2.length();
        
      int [][] dp= new int[n+1][m+1];
    // dp[i][j]=Minimum Deletion of i length  string in text1 and j length string in text2.
    
        for(int i=0; i<=m;i++){
            
            dp[0][i]=i;
        }
        for(int i=0; i<=n;i++){
            
            dp[i][0]=i;
        }
      for(int i=1;i<=n;i++){  
          for(int j=1;j<=m;j++){
              
              char ch1= text1.charAt(i-1);
              char ch2= text2.charAt(j-1);
              
            
              
              if(ch1==ch2){
                  
                  dp[i][j]=  dp[i-1][j-1];
              }else{
                  
                  //dp[i][j]=  1+ Math.min(dp[i-1][j], dp[i][j-1]);
                  int chhota_ans1= 1+dp[i-1][j];
                  int chhota_ans2= 1+ dp[i][j-1];
                  dp[i][j]= Math.min(chhota_ans1, chhota_ans2);
                  
              }
              
          }
      }
        
     return dp[n][m];
    }
}
