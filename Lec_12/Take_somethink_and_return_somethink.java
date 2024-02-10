package Lec_12;

public class Take_somethink_and_return_somethink {
    
	public static int add(int a, int b) {
		System.out.println("add is Start");
		int ans=a+b - sub(a,b);
		System.out.println("add is end");
		 return ans;
	}
	public static int sub(int a, int b){
		// TODO Auto-generated method stub
		System.out.println("sub is Start");
		System.out.println("sub is end");
		return a-b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main is Start");
		int ans= add(12,13);
		System.out.println(ans);
		System.out.println("Main is end");
	}

}
