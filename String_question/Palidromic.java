package String_question;

import java.util.Scanner;

public class Palidromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         
         String str= s.next();
         
         String reverse_str="";
         
         for(int  i= str.length()-1; i>=0;i--) {
     
        	 reverse_str =reverse_str+ str.charAt(i);
         }
         
         System.out.println(reverse_str);
         if(str.equals(reverse_str)) {
        	 
        	 System.out.println("Palidromic");
         }else {
        	 System.out.println("Not Palidromic");
         }
         
         
         
	}

}
