package DP1;

public class fibonacci_method2 {
    
	public static int fibo(int n, int [] brain) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(brain[n] !=0) {
			return brain[n];
		}
		
		int chhota_ans1= fibo(n-1, brain);
		int chhota_ans2=fibo(n-2,brain);
		int mera_ans= chhota_ans1+chhota_ans2;
		brain[n]=mera_ans;
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=10;
        int [] brain=new int[n+1];
        System.out.println(fibo(n, brain));
	}

}
