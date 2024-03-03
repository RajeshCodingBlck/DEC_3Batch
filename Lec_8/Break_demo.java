package Lec_8;

public class Break_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//	 int i=1;
//	  while(i<=2){  
//		  int j=1;  
//		  while(j<=10000) {  
//			  if(j<5) {
//				  System.out.println(j);
//			  }else {
//				 break; 
//			  }
//			  j=j+1;
//		  }
//		  i=i+1;
//	  }
	  
	   int j=1;
		while(j<=10) {  
			
			if(j==5) {
				j=j+1;
				continue;
			}
			System.out.println(j);
			 j=j+1;
		 }
	    
	  }
	}



