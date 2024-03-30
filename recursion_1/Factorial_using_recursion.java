package recursion_1;

public class Factorial_using_recursion {
   
	public static int fact(int n) {
		if(n==0) {
			
			return 1;
		}
		 int chhota_ans=  fact(n-1);	 
		 int mera_ans= n*chhota_ans;		 
		 return mera_ans;
		   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(fact(5));
		
	}

}
