package TwoD_array;

import java.util.Scanner;

public class Input_and_output {
	public static void  display(int [][] arr) {
		
		int row= arr.length;
    	int col= arr[0].length;	
    	for(int i= 0;i<row;i++) {
    		for(int j=0; j<col;j++) {
    			
    			System.out.print(arr[i][j]+ " ");
    		}
    		System.out.println();
    	}
	}
    public static void takeInput(int [][] arr) {
    	
    	Scanner s= new Scanner(System.in);
    	int row= arr.length;
    	int col= arr[0].length;
    	
    	for(int i= 0;i<row;i++) {
    		for(int j=0; j<col;j++) {
    			
    			arr[i][j]=s.nextInt();
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		int row= s.nextInt();
		int col= s.nextInt();
		
		int [][] arr= new int[row][col];
		
		takeInput(arr);
		display(arr);
		
		
	}

}
