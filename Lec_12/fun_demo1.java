package Lec_12;

public class fun_demo1 {

	public static  void add() {
		System.out.println(" add Start");
		int a=12;
		int b=13;
		System.out.println(a+b);
		System.out.println(" add end");
	}
	
	public static  void mul() {
		System.out.println(" mul Start");
		int a=12;
		int b=13;
		System.out.println(a*b);
		System.out.println(" mul end");

	}
	public static  void sub() {
		System.out.println("sub Start");
		int a=12;
		int b=13;
		mul();
		System.out.println(a-b);
		System.out.println("sub end");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Main Start");
         add();
         sub();
         System.out.println("Main end");
	}

}
