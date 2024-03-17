package String_question;

public class Plaidromic_Method_2 {
 
	public static boolean IsPlaidromic(String str) {
		
		int i=0;
		int j= str.length()-1;

		while(i<=j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				 return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="NitiN";
		
		System.out.println(IsPlaidromic(str));
		
		
	}

}
