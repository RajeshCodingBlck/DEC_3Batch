import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);

		String str= s.next();

		int count=0;
		int overall_max=0;

		for(int i=0; i<str.length();i++){

			if(str.charAt(i)=='a'
			   || str.charAt(i)=='e'
			   || str.charAt(i)=='i'
			   || str.charAt(i)=='o'
			   || str.charAt(i)=='u'){
               
			   count++;
			   overall_max= Math.max(overall_max,count);

			   }else{

                  count=0;

			   }
		}
 
     System.out.println(overall_max);

    }
}
