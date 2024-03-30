package recursion_1;

public class sum_of_natural_number {
//   public static int Sumnatural(int n) {
//		
//		if(n==0) {  // -ve Base
//			return 0;
//		}
//		
//		int chhota_ans= Sumnatural(n-1);
//		
//		int mera_ans= n+chhota_ans;
//		
//		return mera_ans;
//		
//		
//	}
	public static int Sumnatural(int n) {
		
		if(n==1) {  // +ve Base
			return 1;
		}
		
		int chhota_ans= Sumnatural(n-1);
		int mera_ans= n+chhota_ans;
		return mera_ans;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Sumnatural(5));
		
	}

}
