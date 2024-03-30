package recursion_1;

public class PrintNaturalNumber {
    
	public static void PrintInc(int n) {
		
		if(n==1) {  // +ve Base Case
			System.out.println(n);
			return ;
		}
		
//		if(n==0) { // -ve Base case
//			
//			return ;
//		}
		
		PrintInc(n-1);
		System.out.println(n);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PrintInc(5);
	}

}
