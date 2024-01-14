package Lec_8;

public class Continue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//	  for(int i=1; i<=5;i++) {
//		  
//		  if(i==3) {
//			continue;  
//		  }else {
//			  System.out.println(i);
//		  }
//		  
//	  }
	  
	  // While loop
	  
	  int i=1;
	  while(i<=5) { 
		  if(i==3) {
			  i=i+1;
			  continue;
		  }else {
			  System.out.println(i);
		  }
		  i=i+1;
	  }
	  
	  
	  
	}

}
