package Recursion_2;

public class CoinToss {

	public static int  PrintOutcomes(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return 1;
		}
		   
	int chhota_ans1= PrintOutcomes(n-1, ans+ "H");
	int chhota_ans2= PrintOutcomes(n-1, ans+"T");
	int mera_ans= chhota_ans1+chhota_ans2;
	return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans=PrintOutcomes(3,"");
		System.out.println(ans);
		
	}

}
