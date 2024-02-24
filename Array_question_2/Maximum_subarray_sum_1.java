package Array_question_2;

public class Maximum_subarray_sum_1 {
        public  static int maxSubArray(int[] arr) {
       
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] arr= {-1,2,3,6};
           int ans= maxSubArray(arr);
	   System.out.println(ans);
	}

}
