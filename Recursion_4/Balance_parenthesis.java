package Recursion_4;

public class Balance_parenthesis {
	public static boolean check(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				count++;
			}else {
				count--;
			}
			if(count<0) {
				return false;
			}
		}
		 return count==0;
		
	}
	public static void Balance(int rem_open, int rem_close, String ans) {
		
		 
		 if(rem_open==0 && rem_close==0) {
			 
			 if(check(ans)) {
				 System.out.println(ans);
			 }
			 
			 return;
		 }
		 
		 if(rem_open<0 || rem_close<0) {
			 return ;
		 }
		
		 if(rem_open> rem_close) {
			 return;
		 }
		 
		Balance(rem_open-1, rem_close, ans+"(");
		Balance(rem_open, rem_close-1, ans+")");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Balance(3,3, "");
		
	}

}
