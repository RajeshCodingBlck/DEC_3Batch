package Recursion_4;

import java.util.*;

public class EqualTwo_set {
   
public static void Subset(int [] arr, int index,
int sum1, int sum2, ArrayList<Integer> s1, ArrayList<Integer> s2, 
int totalsum) {
		
		if(index==arr.length) {
			if(sum1==sum2) {	
				System.out.println(s1+ " "+s2);	
			}
			return ;
		}
		
		if(sum1 >totalsum/2 || sum2>totalsum/2) {
			return ;
		}
		
		
	  s1.add(arr[index]);
	  Subset(arr, index+1, sum1+arr[index], sum2, s1, s2, totalsum);
	  s1.remove(s1.size()-1); 
	  s2.add(arr[index]);
	  Subset(arr, index+1, sum1, sum2+arr[index], s1,s2, totalsum);
	  s2.remove(s2.size()-1);
	  
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	  int [] arr= {1,2,1,2};
	  int totalsum=0;
	  
	  for(int i=0; i<arr.length;i++) {
		  totalsum+=arr[i];
	  }
	  
	  ArrayList<Integer> s1= new ArrayList();
	  ArrayList<Integer> s2= new ArrayList();
	  Subset(arr, 0,0,0,s1, s2, totalsum);
	  
	}

}
