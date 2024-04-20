package Time_complexity;

public class Algo1 {
   
	public static int Sum(int n) {
		
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			
			sum+=i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		long start= System.nanoTime();
		
		System.out.println(Sum(100));
		
		long end= System.nanoTime();
		
		System.out.println(end-start);
		
		
	}

}
