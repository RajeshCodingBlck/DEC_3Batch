package PolyMorphism;

class A1{
	
	int a=12;
	int c=13;
	
	
	public String toString() {
		
		 String str= "a" + "= "+ a + ", "+ "c" + "= "+ c;
		 
		 return str;
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		A1 obj= new A1();
		
		System.out.println(obj);
		
		int [] arr= new int[5];
		//String str= new String ("Hello");
		
		//System.out.println(arr);
		//System.out.println(str);
	
		
	}

}
