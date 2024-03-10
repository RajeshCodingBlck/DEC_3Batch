package BinarySearch;

public class Equation_question {
  
	public static long EquationSolver(int n) {
		
		long low=0;
		long high=n;
		
		long ans=0;
		
		while(low<=high) {
			
			long mid= (low+high)/2;
			
			if(mid*mid<=n) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(EquationSolver(100000000));
		int val= (int)Math.sqrt(100000000);
		System.out.println(val);
	}

}
