package Recursion_2;

public class Binary_combination {
   
	public static void BinaryCombination(int n, String ans) {
		
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		BinaryCombination(n-1,ans+"0");
		BinaryCombination(n-1, ans+"1");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryCombination(3,"");
		
	}

}
