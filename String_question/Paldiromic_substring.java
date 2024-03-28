package String_question;

public class Paldiromic_substring {

	public static boolean isPalidromic(String str) {
		
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
	public static void PrintSubstring(String str) {
		
		
		for(int s=0; s<str.length();s++) {
			
			for(int e=s;e<str.length();e++) {
				
			  String curr_substring= str.substring(s, e+1);
			  
			  if(isPalidromic(curr_substring)) {
				  System.out.println(curr_substring);  
			  }
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str= "aabcdce";
		
		
		PrintSubstring(str);
		
		
	}

}
