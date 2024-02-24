class Solution {
    public int GetSum(int [] arr, int s, int e){
        
        int sum=0;
        
        for(int i=s; i<=e;i++){
            sum+=arr[i];
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return sum;
    }
    public int maxSubArray(int[] arr) {
       
     int overall_max_sum= Integer.MIN_VALUE;
      int currsum=0;
     for(int s=0;s<arr.length;s++){
         
         currsum+=arr[s];
         overall_max_sum= Math.max(overall_max_sum, currsum);
         
         if(currsum<0){
             currsum=0;
         }
         
     }
        
        return overall_max_sum;
    }
}
