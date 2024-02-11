package Lec_13;

public class Global_varible {
   
	static int val=12;
	
	public static void fun(int a) {
		val++;
		int val=14;
		System.out.println(val);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(val);
         int a=30;
         fun(a);
         System.out.println(val);
         System.out.println(a);
	}

}
