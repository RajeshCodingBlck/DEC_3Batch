package Recursion_2;

public class Staircase {
    
	public static void PrintPath(int n,String ans) {
		
		
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		
		if(n<0) {
			return;
		}
		
		PrintPath(n-1,ans+"1");
		PrintPath(n-2, ans+"2");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPath(4, "");
		
	}

}
