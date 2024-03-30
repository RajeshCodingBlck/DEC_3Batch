package recursion_1;

public class PrintDec {
   
	public static void Print(int n) {
		
		   if(n==0) {
			   return ;
		   }
		   System.out.println(n);  
		   Print(n-1);
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Print(5);
         
	}

}
