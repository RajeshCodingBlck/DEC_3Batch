package Array_question_2;

public class Maximum_subarray_sum_1 {
public static int GetSum(int [] arr, int s, int e){
        
        int sum=0;
        
        for(int i=s; i<=e;i++){
            sum+=arr[i];
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        return sum;
    }
    public static  int maxSubArray(int[] arr) {
       
     int overall_max_sum= Integer.MIN_VALUE;
      int currsum=0;
     for(int s=0;s<arr.length;s++){
         currsum=0;
         for(int e=s; e<arr.length;e++){
             
            currsum+=arr[e];
            
           overall_max_sum= Math.max(overall_max_sum, currsum); 
         }
     }
        
        return overall_max_sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
