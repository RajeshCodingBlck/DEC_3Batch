package Array_question_2;

public class Product_of_array {
	public static  int[] productExceptSelf(int[] arr) {
        
	      int n= arr.length;
	      int [] left= new int[n];
	      int [] right= new int[n];
	      int [] final_ans= new int[n];
	      left[0]=1;
	      for(int i=1; i<n;i++){         
	          left[i]=left[i-1]*arr[i-1];
	      }
	      right[n-1]=1;
	      for(int i=n-2; i>=0;i--){
	          right[i]=right[i+1]*arr[i+1];
	      }
	        
	      for(int i=0; i<n;i++){
	          final_ans[i]= left[i]*right[i];
	      }
	        return final_ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      int [] ans=productExceptSelf(arr);
      
      for(int i=0; i<ans.length;i++) {
    	  System.out.print(ans[i]+" ");
      }
	}

}
