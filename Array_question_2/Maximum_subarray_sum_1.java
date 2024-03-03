package Array_question_2;

public class Maximum_subarray_sum_1 {
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
     for(int s=0;s<arr.length;s++){
         
         for(int e=s; e<arr.length;e++){
             
             int currsum= GetSum(arr,s,e);
             
     System.out.println("Cut is from "+ s+ " , "+e+ " and sum is "+currsum);
             
             overall_max_sum= Math.max(overall_max_sum, currsum);
             
         }
     }
        
        return overall_max_sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
