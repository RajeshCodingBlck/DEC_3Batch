package recursion_1;

public class Sum_of_array {
   
	public static int Sum_of_array(int [] arr, int n) {
		
//		if(n==0) {
//			return 0;
//		}
		
		if(n==1) {
			
			return arr[0];
		}
		
		int chhota_ans= Sum_of_array(arr,n-1);
		int mera_ans= arr[n-1]+ chhota_ans;
		return mera_ans;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,40,5};
          int ans= Sum_of_array(arr, arr.length);
          System.out.println(ans);
          
	 }

}
