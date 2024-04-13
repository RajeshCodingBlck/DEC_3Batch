package Recursion_4;

public class Check_parenthesis {
    
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="(((())))))";
		
		System.out.println(check(str));
	}

}
