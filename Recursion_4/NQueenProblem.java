package Recursion_4;

public class NQueenProblem {
   
	public static boolean isSafePosition(char [][] arr, 
			int row, int col) {
		
		
		//Checking the row of current column
		
		for(int i=0; i<=row;i++) {
			
			if(arr[i][col]=='Q') {
				return false;
			}
		}
		
		int nr=row;
		int nc=col;
		
		// Check Main Diagonal
		while(nr>=0 && nc<arr.length) {
			
			if(arr[nr][nc]=='Q') {
				return false;
			}
			
			nr--;
			nc++;
		}
		
		// Check off Diagonal
		nr= row;
		nc=col;
		while(nr>=0 && nc>=0) {
			
			if(arr[nr][nc]=='Q') {
				return false;
			}
			
			nr--;
			nc--;
		}
		
		return true;
		
		
	}
	public static void Nqueen(char [][] arr, int row, int rem_queen) {
		
		if(rem_queen==0) {
			
			for(int i=0; i<arr.length;i++) {
				
				for(int j=0; j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println();
			
			return;
		}
		
		
		for(int i=0; i<arr[row].length;i++) {
			
			if(isSafePosition(arr,row,i)==true) {
				arr[row][i]='Q';
				Nqueen(arr, row+1, rem_queen-1);
				arr[row][i]='.';
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=4;
     
     char [][] arr= new char[n][n];
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				arr[i][j]='.';
			}
		}
		
		Nqueen(arr, 0, n);
		
     
	}

}
