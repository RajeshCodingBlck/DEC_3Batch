package DP3;

public class LongestSubarrayofAlterparity {
    
	public static int MAximumAlternative(int [] arr) {
		
		int n=arr.length;
		int [] dp= new int[arr.length];
		
		dp[0]=1;
		int overallmax=1;
		for(int i=1;i<n;i++) {
			if(Math.abs(arr[i])%2 == Math.abs(arr[i-1])%2) {
				dp[i]=1;
			}else {
				dp[i]=dp[i-1]+1;
			}
			overallmax= Math.max(overallmax, dp[i]);
		}
		
		return overallmax;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int val=-3;
//     System.out.println(val%2);
		
		int [] arr= {2,2,1,2,3,4,5,9,10};
		
        System.out.println(MAximumAlternative(arr));
	}

}
