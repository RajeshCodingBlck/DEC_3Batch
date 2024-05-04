package PolyMorphism;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		A obj= new B();
		
	    System.out.println(((B)(obj)).d);
	    obj.fun(23);  
	    
	}

}
