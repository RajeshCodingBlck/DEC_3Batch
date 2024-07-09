class Solution {
    public int helper(String text1, String text2, int i, int j){
        
        // There is two possibility
        // Character Equal honge
        
        if(i== text1.length () || j==text2.length()){
            
            return 0;
        }
        
        char ch1= text1.charAt(i);
        char ch2= text2.charAt(j);
        
        if(ch1==ch2){
            
          int mera_ans=  1+helper(text1, text2, i+1, j+1);
            return mera_ans;
            
        }else{
            
            int chhota_ans1= helper(text1, text2, i+1, j);
            int chhota_ans2= helper(text1, text2, i, j+1);
            
            int mera_ans= Math.max(chhota_ans1, chhota_ans2);
            return mera_ans;
        }
        

        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
        return helper(text1, text2, 0,0);
        
    }
}
