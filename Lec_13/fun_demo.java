package Lec_13;

public class fun_demo {
    
	public static int add(int a, int b) {
		
		return  sub(a,b)+a+b;
	}
    
	public static int sub(int a, int b) {
		
		a++;
		b++;
		return a-b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=13;
		int ans= add(a,b);
		System.out.println(ans);
		
	}

}
