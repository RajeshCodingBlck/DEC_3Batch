package String_question;

public class Frequency_ofcharacters_in_string {

	public static void freInString(String str) {
		
		int [] fre_array= new int[256];
		
		for(int i=0; i<str.length();i++) {
			
			int ascii= str.charAt(i);
			fre_array[ascii]= fre_array[ascii]+1;
		}
		
		
		for(int i=0; i<256;i++) {
			
			if(fre_array[i]>0) {
				
				char ch= (char)i;
				System.out.println(ch+ " -> "+ fre_array[i]);
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str= "abbbcdeddd";
		freInString(str);
		
		
	}

}
