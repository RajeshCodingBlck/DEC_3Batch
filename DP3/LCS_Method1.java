class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
      int n= text1.length();
      int m= text2.length();
        
      int [][] dp= new int[n][m];
    
      for(int i=0;i<n;i++){  
          for(int j=0;j<m;j++){
              
              char ch1= text1.charAt(i);
              char ch2= text2.charAt(j);
              
              if(i==0 && j==0){
                  
                  if(ch1==ch2){
                      dp[0][0]=1;
                  }else{
                      dp[0][0]=0;
                  }
                  
                  continue;
              }
              
              if(i==0){
                  
                  if(ch1==ch2){
                      dp[i][j]=1;
                  }else{
                      dp[i][j]=dp[i][j-1];
                  }
                  
                  continue;
              }
              if(j==0){
                  
                  if(ch1==ch2){
                      dp[i][j]=1;
                  }else{
                      dp[i][j]=dp[i-1][j];
                  }
                  continue;
              }
              
              
              if(ch1==ch2){
                  
                  dp[i][j]= 1+ dp[i-1][j-1];
              }else{
                  
                  dp[i][j]=  Math.max(dp[i-1][j], dp[i][j-1]);
              }
              
          }
      }
        
        return dp[n-1][m-1];
    }
}
