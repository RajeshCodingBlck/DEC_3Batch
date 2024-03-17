package String_question;

public class Sort_the_String {
    
	public static void Sort(String str) {
		
       int [] fre_array= new int[256];
		
		for(int i=0; i<str.length();i++) {
			
			int ascii= str.charAt(i);
			fre_array[ascii]= fre_array[ascii]+1;
		}
		
		String sorted_string="";
		
		for(int i=0; i<256;i++) {
			
		     if(fre_array[i]>0) {
		    	 
		    	 int val= fre_array[i];
		    	 
		    	 while(val>0) {
		    		 
		    		 char ch= (char)(i);
		    		 sorted_string+=ch;
		    		 val--;
		    				 
		    	 }
		     }
		}
		System.out.println(sorted_string);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str="addeaf";
		Sort(str);
	}

}
