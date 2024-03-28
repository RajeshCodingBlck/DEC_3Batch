package String_question;

public class String_question {

	public static void PrintSubstring(String str) {
		
		
		for(int s=0;s<str.length();s++) {
			
			for(int end=s; end<str.length();end++) {
				
				System.out.println(s+ ", "+end);
				
//				for(int k=s; k<=end;k++) {
//					System.out.print(str.charAt(k));
//				}
				String substring= str.substring(s, end+1);
				
				System.out.println(substring);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str="abcde";
		
		PrintSubstring(str);
		
		
	}

}
