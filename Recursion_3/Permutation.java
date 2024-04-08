package Recursion_3;

public class Permutation {
   
	public static void permutation(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		 
		for(int i=0; i<str.length();i++) {
			
			char ch= str.charAt(i);
			
			String Left_part= str.substring(0,i);
			String right_part= str.substring(i+1);
			
			String chhota_str  =Left_part+right_part;
			
			permutation(chhota_str, ans+ch);
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("aab", "");
	}

}
