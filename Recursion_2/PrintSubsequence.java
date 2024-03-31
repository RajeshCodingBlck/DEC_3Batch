package Recursion_2;

public class PrintSubsequence {
   
	public static void PrintSubse(String str, String ans) {
		
		  if(str.length()==0) {
			  System.out.println(ans);
			  return ;
		  }
		
		char ch= str.charAt(0);
		PrintSubse(str.substring(1), ans+"");
		PrintSubse(str.substring(1), ans+ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		PrintSubse("abc", "");
		
	}

}
