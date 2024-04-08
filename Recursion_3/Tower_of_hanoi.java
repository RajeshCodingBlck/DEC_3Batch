package Recursion_3;

public class Tower_of_hanoi {
    
	public static int  TOH(int n,  char rod1, char rod2 , char rod3) {
		
		 if(n==0) {
			 return 0;
		 }
		
		int chhota_ans1= TOH(n-1, rod1,  rod3 ,rod2);
		 System.out.println("Move the "+ n+ "th Ring from "+rod1 + " to "+ rod3);
		int chhota_ans2= TOH(n-1, rod2,  rod1 ,rod3);
		
		
		
		int mera_ans= chhota_ans1+chhota_ans2+1;
		return mera_ans;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(TOH(3, 'A', 'B', 'C'));
		
	}

}
